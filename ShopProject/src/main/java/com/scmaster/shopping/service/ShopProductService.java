package com.scmaster.shopping.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scmaster.shopping.dao.ShopProductDAO;
import com.scmaster.shopping.dao.ShopProductMapper;
import com.scmaster.shopping.vo.ShopProduct;

@Service
public class ShopProductService {
	
	@Autowired
	private ShopProductDAO dao;

	public void shop_product_insert(ShopProduct product) {
		
		dao.shop_product_insert(product);
		
	}
	
	public ArrayList<ShopProduct> shop_product_select_list(){
		ArrayList<ShopProduct> result = new ArrayList<>();
		
		result = dao.shop_product_select_list();
		
		return result;
	}
	
	public ShopProduct shop_product_select_one(int product_seq) {
		ShopProduct result = null;
		
		result = dao.shop_product_select_one(product_seq);
		
		return result;
	}
	
	public void shop_product_update(ShopProduct product) {
		
		dao.shop_product_update(product);
		
	}
	
	public void shop_product_delete(int product_seq) {
		
		dao.shop_product_delete(product_seq);
	}
	
	public void shop_product_buy(HashMap<String, Object> params) {
		
		dao.shop_product_buy(params);
	
	}
	
	public void shop_product_update_qty(HashMap<String, Object> params) {
		
		dao.shop_product_update_qty(params);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
