package com.scmaster.shopping.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scmaster.shopping.service.ShopProductService;
import com.scmaster.shopping.vo.ShopProduct;

@Controller
public class ShopProductController {
	
	@Autowired
	private ShopProductService service;
	
	@RequestMapping(value="/product/insert_form", method = RequestMethod.GET)
	public String shop_product_insert_form() {
		
		return "/product/insert_form";
	}
	//관리자용
	@RequestMapping(value="/product/list", method = RequestMethod.GET)
	public String shop_product_list(Model model) {
		
		ArrayList<ShopProduct> result = service.shop_product_select_list();
		
		model.addAttribute("product_list", result);
		
		return "/product/list_form";
	}
	
	//회원용
	@RequestMapping(value="/product/list_for_user", method = RequestMethod.GET)
	public String shop_product_list_for_user(Model model) {
		ArrayList<ShopProduct> result = service.shop_product_select_list();
		
		model.addAttribute("product_list", result);
		
		return "/product/list_form_for_user";
	}
	
	
	@RequestMapping(value="/product/insert" , method = RequestMethod.POST)
	public String shop_product_insert(ShopProduct product) {
		
		service.shop_product_insert(product);
		
		//리다이렉트 상품목록 요청
		return "redirect:/product/list";
		
	}
	
	//관리자 수정용도
	@RequestMapping(value="/product/search" , method = RequestMethod.GET)
	public String shop_product_select_one(int product_seq, Model model) {
		ShopProduct result = null;
		
		result = service.shop_product_select_one(product_seq);
		
		model.addAttribute("result", result);
		
		return "/product/update_form";
	}
	
	//회원 구매용도
	@RequestMapping(value="/product/buy_form", method=RequestMethod.GET)
	public String shop_product_buy_form(int product_seq, Model model) {
		ShopProduct result = null;
		
		result = service.shop_product_select_one(product_seq);
		
		model.addAttribute("result", result);
		
		return "/product/buy_form";
	}
	
	@RequestMapping(value="/product/buy" , method=RequestMethod.POST)
	public String shop_product_buy(int sold_qty, int product_seq,HttpSession session) {
		String user_id = (String)session.getAttribute("user_id");
		
		HashMap<String, Object> params = new HashMap<>();
		params.put("user_id", user_id);
		params.put("sold_qty", sold_qty);
		params.put("product_seq", product_seq);
		
		service.shop_product_buy(params);
		service.shop_product_update_qty(params);
		
		
		return "redirect:/product/list_for_user";
	}
	
	
	
	@RequestMapping(value="/product/update", method=RequestMethod.POST)
	public String shop_product_update(ShopProduct product) {
		
		service.shop_product_update(product);
		
		return "redirect:/product/list";
	}
	
	@RequestMapping(value="/product/delete", method=RequestMethod.GET)
	public String shop_product_delete(int product_seq) {
		
		service.shop_product_delete(product_seq);
		
		return "redirect:/product/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
