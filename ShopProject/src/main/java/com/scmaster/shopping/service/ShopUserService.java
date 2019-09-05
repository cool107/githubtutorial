package com.scmaster.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scmaster.shopping.dao.ShopUserDAO;
import com.scmaster.shopping.dao.ShopUserMapper;
import com.scmaster.shopping.vo.ShopUser;

@Service
public class ShopUserService {
	
	@Autowired
	private ShopUserDAO dao;
	
	public void shop_user_insert(ShopUser user) {
	
		dao.shop_user_insert(user);
		
	}
	
	public boolean shop_user_select(ShopUser user) {
		ShopUser result = null;
		
		result = dao.shop_user_select(user.getUser_id());
		
		if(result == null) {
			return false;
		}else if(!user.getUser_pw().equals(result.getUser_pw())) {
			return false;
		}
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
