package com.scmaster.shopping.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scmaster.shopping.vo.ShopProduct;

@Repository
public class ShopProductDAO {
	
	@Autowired
	private SqlSession session;
	
	public void shop_product_insert(ShopProduct product) {
		
		ShopProductMapper mapper = session.getMapper(ShopProductMapper.class);
		
		try {
			mapper.shop_product_insert(product);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public ArrayList<ShopProduct> shop_product_select_list(){
		ShopProductMapper mapper = session.getMapper(ShopProductMapper.class);
		ArrayList<ShopProduct> result = new ArrayList<>();
		
		try {
			result = mapper.shop_product_select_list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public ShopProduct shop_product_select_one(int product_seq) {
		ShopProductMapper mapper = session.getMapper(ShopProductMapper.class);
		ShopProduct result = null;
		
		try {
			result = mapper.shop_product_select_one(product_seq);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public void shop_product_update(ShopProduct product) {
		ShopProductMapper mapper = session.getMapper(ShopProductMapper.class);
		
		try {
			mapper.shop_product_update(product);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void shop_product_delete(int product_seq) {
		ShopProductMapper mapper = session.getMapper(ShopProductMapper.class);
		
		try {
			mapper.shop_product_delete(product_seq);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void shop_product_buy(HashMap<String, Object> params) {
		ShopProductMapper mapper = session.getMapper(ShopProductMapper.class);
		
		try {
			mapper.shop_product_buy(params);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void shop_product_update_qty(HashMap<String, Object> params) {
		ShopProductMapper mapper = session.getMapper(ShopProductMapper.class);
		try {
			mapper.shop_product_update_qty(params);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
