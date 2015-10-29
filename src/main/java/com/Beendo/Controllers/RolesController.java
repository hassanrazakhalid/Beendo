package com.Beendo.Controllers;

import java.util.HashMap;
import java.util.List;

import javax.swing.event.RowSorterListener;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Beendo.Constants.Constants;
import com.Beendo.Entities.RoleAndPermission;
import com.Beendo.Service.RoleAndPermissionService;

@Controller
public class RolesController {

	private RoleAndPermissionService roleAndPer = new RoleAndPermissionService();
	
	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	public ModelAndView Roles(@RequestParam HashMap<String, String>hasMap){
		
		ModelAndView mv = new ModelAndView("roles");
		
	List list =	roleAndPer.findAll();
		
		mv.addObject("rolesList", list);
		addBaseUrl(mv);
		return mv;
	}
	
	@RequestMapping(value = "/roleSubmitted", method = RequestMethod.POST)
	public ModelAndView rolesSubmitted(@RequestParam HashMap<String, String>hashMap){
		
		ModelAndView mv = new ModelAndView("roles");
		
		RoleAndPermission role = RoleAndPermissionService.getObject(hashMap);
		roleAndPer.save(role);
		
		addBaseUrl(mv);
		return mv;
	}
	
	private void addBaseUrl(ModelAndView mv){
		
		String url = Constants.URL+ ":"+ Constants.PORT + "/" + Constants.ROOT + "/";
		mv.addObject("BaseURL", url);
	}

	
}
