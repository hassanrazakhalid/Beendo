package com.Beendo.Controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Beendo.Constants.*;

@Controller
public class LoginController {

	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView index(){
		
//		return "index";
		ModelAndView mv = new ModelAndView("login");
		addBaseUrl(mv);
		return mv;
	}
	
	@RequestMapping(value = "/loginSubmitted",method = RequestMethod.POST )
	public ModelAndView loginSubmited(@RequestParam Map<String,String>sender){
		
		String email = sender.get("email");
		String password = sender.get("password");
		
		ModelAndView mv = new ModelAndView("home");
		return mv;
	
	}
	
//	@ModelAttribute
	private void addBaseUrl(ModelAndView mv){
		
		String url = Constants.URL+ ":"+ Constants.PORT + "/" + Constants.ROOT + "/";
		mv.addObject("BaseURL", url);
	}
	
	
}
