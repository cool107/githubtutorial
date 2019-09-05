package com.scmaster.shopping.dao;

import com.scmaster.shopping.vo.ShopUser;

public interface ShopUserMapper {
	public void shop_user_insert(ShopUser user);
	
	public ShopUser shop_user_select(String user_id);
}
