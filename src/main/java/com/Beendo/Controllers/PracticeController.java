package com.Beendo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PracticeController {

	@RequestMapping(value = "/practice", method = RequestMethod.GET)
	public ModelAndView Practice(){
		
		ModelAndView mv = new ModelAndView("practice");
		return mv;
	
	}
	
}
