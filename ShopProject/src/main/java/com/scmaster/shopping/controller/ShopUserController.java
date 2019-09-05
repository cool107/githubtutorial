package com.scmaster.shopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scmaster.shopping.service.ShopUserService;
import com.scmaster.shopping.vo.ShopUser;

@Controller
public class ShopUserController {
	
	@Autowired
	private ShopUserService service;
	
	@RequestMapping(value="/user/insert" , method=RequestMethod.GET)
	public String shop_user_insert_form() {
		
		return "/user/insert_form";
	}
	
	@RequestMapping(value="/user/insert" , method=RequestMethod.POST)
	public String shop_user_insert(ShopUser user) {
		
		System.out.println(user);
		
		service.shop_user_insert(user);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/user/login" , method=RequestMethod.POST)
	public String shop_user_select(ShopUser user,HttpSession session) {
		boolean result = service.shop_user_select(user);
		
		if(result) {
			session.setAttribute("user_id", user.getUser_id());
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/user/login_form", method=RequestMethod.GET)
	public String shop_user_login_form() {
		return "/user/login_form";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
