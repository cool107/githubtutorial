package com.scmaster.shopping.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scmaster.shopping.vo.ShopProduct;

public interface ShopProductMapper {

	public void shop_product_insert(ShopProduct product);
	
	public ArrayList<ShopProduct> shop_product_select_list();
	
	public ShopProduct shop_product_select_one(int product_seq);
	
	public void shop_product_update(ShopProduct product);
	
	public void shop_product_delete(int product_seq);
	
	public void shop_product_buy(HashMap<String, Object> params);
	
	public void shop_product_update_qty(HashMap<String, Object> params);
	
	
	
	
	
	
	
	
	
}
