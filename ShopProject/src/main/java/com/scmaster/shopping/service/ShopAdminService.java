package com.scmaster.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scmaster.shopping.dao.ShopAdminDAO;
import com.scmaster.shopping.vo.ShopAdmin;

@Service
public class ShopAdminService {
	
	@Autowired
	private ShopAdminDAO dao;
	
	public boolean shop_admin_select(ShopAdmin shopAdmin) {
		
		ShopAdmin result = null;
		
		result = dao.shop_admin_select(shopAdmin.getAdmin_id());
		
		if(result == null) {
			//아이디가 없는경우
			return false;
		}else if(!result.getAdmin_pw().equals(shopAdmin.getAdmin_pw())) {
			//비밀번호가 틀린경우
			return false;
		}
			
		return true;
		
	}
}
