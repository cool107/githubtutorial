package com.scmaster.shopping.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scmaster.shopping.vo.ShopAdmin;

@Repository
public class ShopAdminDAO {

	@Autowired
	private SqlSession session;
	
	public ShopAdmin shop_admin_select(String admin_id) {
		ShopAdminMapper mapper = session.getMapper(ShopAdminMapper.class);
		ShopAdmin result = null;
		
		try {
			result = mapper.shop_admin_select(admin_id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
}
