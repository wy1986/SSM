package com.wy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String loginCheck(@RequestParam("username") String username,HttpSession session)
	{
		if(username.equals("wang"))
		{
			session.setAttribute("username", "wang");
			return "redirect:/getTeachers";
		}
		return "toLogin";
	}
	
	@RequestMapping("/toLogin")
	public String toLogin(HttpSession session)
	{
		session.invalidate();
		return "redirect:index.jsp";
	}

}
