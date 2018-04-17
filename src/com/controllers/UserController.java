package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDAO;
import com.dao.UserDAOImpl;
import com.model.User;

@Controller
public class UserController {
	private UserDAO refUserDAO;
	
	public UserController() {
    	refUserDAO=new UserDAOImpl();     
    }
	
	@RequestMapping(value="user", method = RequestMethod.GET)
	public ModelAndView country(){
		return new ModelAndView("userForm","user",new User());
	}
	
	@RequestMapping(value="checkUser", method = RequestMethod.POST)
	public String checkUser(@ModelAttribute("user") User user, ModelMap model) {
		model.addAttribute("userNameRef", user.getUserName());
		model.addAttribute("passwordRef", user.getPassword());
		if(refUserDAO.loginAuthetication(user)) {
			return "success";
		}else {
			model.addAttribute("userNameRef", "Fail to Login as "+user.getUserName());
			return "userForm";
		}
		
	}	
}
