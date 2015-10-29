package com.Beendo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RolesController {

	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	public ModelAndView Roles(){
		
		ModelAndView mv = new ModelAndView("roles");
		return mv;
	
	}
	
}
