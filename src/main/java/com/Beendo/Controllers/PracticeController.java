package com.Beendo.Controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Beendo.Entities.Practise;
import com.Beendo.Entities.User;
import com.Beendo.HibernateUtils.Constants;
import com.Beendo.Service.PracticeService;

@Controller
public class PracticeController {

	@Autowired
	PracticeService practiceService;
	
	private void addBaseUrl(ModelAndView mv){
		
		String url = Constants.URL+ ":"+ Constants.PORT + "/" + Constants.ROOT + "/";
		mv.addObject("BaseURL", url);
	}
	
	@RequestMapping(value = "/practice", method = RequestMethod.GET)
	public ModelAndView Practice(){
		
		ModelAndView mv = new ModelAndView("practice");
		addBaseUrl(mv);
		
		try
		{
			List<Practise> list = practiceService.GetAll();		
			mv.addObject("Practices", list);
			mv.addObject("user", new User());
		}
		catch(Exception ex)
		{}
		
		return mv;
		
	}
	
	
	void Add(String PracticeName)
	{
		Practise entity = new Practise();
		entity.setName(PracticeName);
		practiceService.Save(entity);
	}

    
	
	@RequestMapping(value = "/savePractice", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("user")User user, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }

        Add(user.getName());
        return "redirect:/practice";
    }	
	
	
	@RequestMapping(value = "/practice/delete/{id}")
    public String delete(Model model, @PathVariable int id) {

		practiceService.Delete(id);
		
        return "redirect:/practice";
    }	
	
	
	@RequestMapping(value = "/practice/edit")
	public String edit(@Valid @ModelAttribute("user")User user, 
		      BindingResult result, ModelMap model) {
		        if (result.hasErrors()) {
		            return "error";
		        }

		Practise pr = new Practise();
		pr.setId(user.getUser_id());
		pr.setName(user.getName());
		        
		practiceService.Update(pr);
		
		//String nam = user.getName()
        return "redirect:/practice";
    }	
	
}
