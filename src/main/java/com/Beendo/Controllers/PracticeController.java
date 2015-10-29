package com.Beendo.Controllers;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Beendo.Entities.Practise;
import com.Beendo.Service.PracticeService;

@Controller
public class PracticeController {

	
	PracticeService practiceService = new PracticeService();
	
	@RequestMapping(value = "/practice", method = RequestMethod.GET)
	public ModelAndView Practice(){
		
		ModelAndView mv = new ModelAndView("practice");
		
		try
		{
			List<Practise> list = practiceService.GetAll();		
			mv.addObject("Practices", list);
		}
		catch(Exception ex)
		{}
		
		return mv;
	
	}
	
	@RequestMapping(value = "/addPractice", method = RequestMethod.POST)
	public ModelAndView AddPractice(@RequestParam Map<String,String>sender){
		
		Add(sender.get("txtPracticeName"));
		ModelAndView mv = new ModelAndView("practice");
		return mv;
	
	}
	
	void Add(String PracticeName)
	{
		Practise entity = new Practise();
		entity.setName(PracticeName);
		practiceService.Save(entity);
	}
	
}
