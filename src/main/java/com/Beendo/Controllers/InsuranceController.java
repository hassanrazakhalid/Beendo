package com.Beendo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InsuranceController {

	@RequestMapping(value = "/insurance", method = RequestMethod.GET)
	public ModelAndView Insurance(){
		
		ModelAndView mv = new ModelAndView("insurance");
		return mv;
	
	}
	
}
