package com.Beendo.Controllers;

import java.util.HashMap;
import java.util.List;

import javax.swing.event.RowSorterListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Beendo.Entities.RoleAndPermission;
import com.Beendo.HibernateUtils.Constants;
import com.Beendo.Service.RoleAndPermissionService;

@Controller
public class RolesController {

	@Autowired
	private RoleAndPermissionService roleAndPer;
	
	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	public ModelAndView Roles(@RequestParam HashMap<String, String>hasMap){
		
		ModelAndView mv = new ModelAndView("roles");
		
	List list =	roleAndPer.findAll();
		
		mv.addObject("rolesList", list);
		addBaseUrl(mv);
		return mv;
	}
	
	@RequestMapping(value = "/roleSubmitted", method = RequestMethod.POST)
	public String rolesSubmitted(@RequestParam HashMap<String, String>hashMap){
		
//		ModelAndView mv = new ModelAndView("roles");
		
		RoleAndPermission role = roleAndPer.getObject(hashMap);
		roleAndPer.save(role);
		
//		addBaseUrl(mv);
		return "redirect:/roles";
//		return mv;
	}
	
	private void addBaseUrl(ModelAndView mv){
		
		String url = Constants.URL+ ":"+ Constants.PORT + "/" + Constants.ROOT + "/";
		mv.addObject("BaseURL", url);
	}

	@RequestMapping(value = "/roles/delete/{id}")
    public String delete(@PathVariable int id) {

		roleAndPer.deleteById(id);
		
        return "redirect:/roles";
    }
	
	@RequestMapping(value = "/roles/update/{id}")
    public String update(@PathVariable int id,@RequestParam HashMap<String, String>sender) {

		roleAndPer.update(id, sender);
//		roleAndPer.deleteById(id);
		
        return "redirect:/roles";
    }
}
