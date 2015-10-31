package com.Beendo.Controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Beendo.Entities.Practise;
import com.Beendo.Entities.User;
import com.Beendo.Service.PracticeService;

@Controller
public class PracticeController {

	@Autowired
	PracticeService practiceService;
	
	@RequestMapping(value = "/practice", method = RequestMethod.GET)
	public ModelAndView Practice(){
		
		ModelAndView mv = new ModelAndView("practice");
		
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
	
}
