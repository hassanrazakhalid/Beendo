package com.Beendo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BalancerController {

	@RequestMapping(value = "/insurance", method = RequestMethod.GET)
	public ModelAndView Insurance(){
		
		ModelAndView mv = new ModelAndView("insurance");
		//addBaseUrl(mv);
		return mv;
	
	}
	
	@RequestMapping(value = "/practice", method = RequestMethod.GET)
	public ModelAndView Practice(){
		
		ModelAndView mv = new ModelAndView("practice");
		//addBaseUrl(mv);
		return mv;
	
	}
	 
	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	public ModelAndView Roles(){
		
		ModelAndView mv = new ModelAndView("roles");
		//addBaseUrl(mv);
		return mv;
	
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ModelAndView Users(){
		
		ModelAndView mv = new ModelAndView("users");
		//addBaseUrl(mv);
		return mv;
	
	}
	
	
}
