package com.scmaster.shopping.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scmaster.shopping.vo.ShopUser;

@Repository
public class ShopUserDAO {
	
	
	@Autowired
	private SqlSession session;
	
	public void shop_user_insert(ShopUser user) {
		ShopUserMapper mapper = session.getMapper(ShopUserMapper.class);

		try {
			mapper.shop_user_insert(user);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ShopUser shop_user_select(String user_id) {
		ShopUserMapper mapper = session.getMapper(ShopUserMapper.class);
		ShopUser result = null;
		
		try {
			result = mapper.shop_user_select(user_id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
