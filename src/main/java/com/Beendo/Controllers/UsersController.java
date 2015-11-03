package com.Beendo.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Beendo.Entities.Insurance;
import com.Beendo.Entities.User;
import com.Beendo.HibernateUtils.Constants;
import com.Beendo.Service.InsuranceService;
import com.Beendo.Service.UserService;

@Controller
public class UsersController {

	
	@Autowired
	UserService userService;
	
	
	private void addBaseUrl(ModelAndView mv){
		
		String url = Constants.URL+ ":"+ Constants.PORT + "/" + Constants.ROOT + "/";
		mv.addObject("BaseURL", url);
	}
	
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ModelAndView Users(){
		
		ModelAndView mv = new ModelAndView("users");
		addBaseUrl(mv);
		
		List<User> list = userService.findAll();
		mv.addObject("Users", list);
		mv.addObject("user", new User());
		
		return mv;
	
	}
	
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("user")User user, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }

        User entity = new User();
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPassword(user.getPassword());
		//entity.setRoleAndPermission(roleAndPermission);
		userService.save(entity);
		
        return "redirect:/users";
    }	
	
	
	@RequestMapping(value = "/users/edit", method = RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("user")User user, 
		      BindingResult result, ModelMap model) {
		        if (result.hasErrors()) {
		            return "error";
		        }
		        
		userService.update(user);
		
        return "redirect:/users";
    }	
	
	
	@RequestMapping(value = "/users/delete/{id}")
    public String Delete(Model model, @PathVariable int id) {

		userService.delete(id);
		
        return "redirect:/users";
    }
	
	
}
