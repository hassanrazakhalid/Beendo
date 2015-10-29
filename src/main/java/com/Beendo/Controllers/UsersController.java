package com.Beendo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ModelAndView Users(){
		
		ModelAndView mv = new ModelAndView("users");
		return mv;
	
	}
	
}
