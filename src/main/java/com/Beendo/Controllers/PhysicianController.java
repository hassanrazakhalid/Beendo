package com.Beendo.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Beendo.Service.PhysicianService;
import com.Beendo.Entities.Physician;
import com.Beendo.Entities.Practise;
import com.Beendo.Entities.User;
import com.Beendo.HibernateUtils.Constants;

@Controller
public class PhysicianController {

	@Autowired
	PhysicianService physicianService;
	
	
	private void addBaseUrl(ModelAndView mv){
		
		String url = Constants.URL+ ":"+ Constants.PORT + "/" + Constants.ROOT + "/";
		mv.addObject("BaseURL", url);
	}
	
	
	@RequestMapping(value = "/physician", method = RequestMethod.GET)
	public ModelAndView Physician(){
		
		ModelAndView mv = new ModelAndView("physician");
		addBaseUrl(mv);
		
		List<Physician> list = physicianService.GetAll();
		mv.addObject("Physicians", list);
		mv.addObject("physician", new Physician());
		
		return mv;
	
	}
	
	
	@RequestMapping(value = "/savePhysician", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("physician")Physician physician, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }

        Physician entity = new Physician();
		entity.setName(physician.getName());
		physicianService.Save(entity);
		
        return "redirect:/physician";
    }	
	
	@RequestMapping(value = "/physician/delete/{id}")
    public String delete(Model model, @PathVariable int id) {

		physicianService.Delete(id);
		
        return "redirect:/physician";
    }
	
	
	@RequestMapping(value = "/physician/edit")
	public String edit(@Valid @ModelAttribute("physician")Physician physician, 
		      BindingResult result, ModelMap model) {
		        if (result.hasErrors()) {
		            return "error";
		        }

//		Physician entity = new Physician();
//		entity.setId(physician.getId());
//		entity.setName(physician.getName());
		        
		physicianService.Update(physician);
		
        return "redirect:/physician";
    }	
	
	
}
