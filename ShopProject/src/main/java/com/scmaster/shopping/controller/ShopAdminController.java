package com.scmaster.shopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scmaster.shopping.service.ShopAdminService;
import com.scmaster.shopping.vo.ShopAdmin;

@Controller
public class ShopAdminController {
	
	@Autowired
	private ShopAdminService service;
	
	@RequestMapping(value="/admin/login", method = RequestMethod.POST)
	public String shop_admin_login(ShopAdmin admin,HttpSession session) {
		
		boolean result = service.shop_admin_select(admin);
		
		if(result) {
			//로그인 성공시
			session.setAttribute("admin_id", admin.getAdmin_id());
		}
		//로그인 실패시
		else {
			//로그인 폼으로 리다이렉트
			return "redirect:/admin/login_form";
		}
		
		//메인으로
		return"redirect:/";
	}
	
	//로그인 폼 이동 함수
	@RequestMapping(value="/admin/login_form", method = RequestMethod.GET)
	public String login_form() {
		return "/admin/login_form";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
