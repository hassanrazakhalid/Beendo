package com.Beendo.Controllers;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.Log4jLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Beendo.HibernateUtils.*;
import com.Beendo.Entities.Practise;
import com.Beendo.Entities.RoleAndPermission;
import com.Beendo.Entities.User;
import com.Beendo.HibernateUtils.Constants;
//import com.Beendo.HibernateUtils.HibernateUtil;
import com.Beendo.HibernateUtils.HibernateUtil;
import com.Beendo.HibernateUtils.SharedData;
import com.Beendo.Service.UserService;
 
@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView index(){
		
//		return "index";
		logger.info("Called Login Page");
		ModelAndView mv = new ModelAndView("login");
		addBaseUrl(mv);
		return mv;
	}
	
	@RequestMapping(value = "/loginSubmitted",method = RequestMethod.POST )
	public ModelAndView loginSubmited(@RequestParam Map<String,String>sender){
		
		String email = sender.get("email");
		String password = sender.get("password");
		
		
//		UserService userService = new UserService();
		User user = userService.isUserValid(email, password);
//		User user = User.isUserValid(email, password);
		SharedData.getSharedInstace().currentUser = user;
		
//		getUsers();
//		addUser();
		
		
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	void getUsers(){
		
		String hql = "FROM User";
//		String hql = "SELECT U.name FROM User U where U.name = :name";
		
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.openSession();
		
//		Query query = (Query)session.createQuery(hql);
//		query.setParameter("name", "pk");
//		List results = query.list();
	}
	
	void addUser(){
		
		UserService userService = new UserService();
		
		User user = new User();
		user.setEmail("hassan@hotmail.com");
		user.setPassword("123456");
		user.setName("HRK");
		
		userService.save(user);
		
//		RoleAndPermission role = new RoleAndPermission();
//		role.setType("admin");
//		role.setCreate(true);
//		role.setRead(true);
//		role.setDelete(false);
//		role.setUpdate(true);
//		
//		user.setRole(role);
////		role.setUser(user);
//		Practise practise = new Practise();
//		practise.setName("Clinic");
//		
//		user.getPractiseList().add(practise);
//		
//		
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.openSession();
//			
//		session.beginTransaction();
//		
////        Session session = sessionFactory.openSession();
//        session.save(user);
////        session.save(studnet2);
//        
//        session.getTransaction().commit();
//        
//        session.close();
//        sessionFactory.close();

		
	}
	
	
	
//	@ModelAttribute
	private void addBaseUrl(ModelAndView mv){
		
		String url = Constants.URL+ ":"+ Constants.PORT + "/" + Constants.ROOT + "/";
		mv.addObject("BaseURL", url);
	}
	
	
}
