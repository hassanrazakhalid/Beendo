package com.Beendo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PhysicianController {

	@RequestMapping(value = "/physician", method = RequestMethod.GET)
	public ModelAndView Physician(){
		
		ModelAndView mv = new ModelAndView("physician");
		return mv;
	
	}
	
}
