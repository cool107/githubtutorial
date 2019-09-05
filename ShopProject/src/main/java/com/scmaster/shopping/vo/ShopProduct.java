package com.scmaster.shopping.vo;

public class ShopProduct {
	private int product_seq;
	private String product_nm;
	private int product_qty;
	private int product_price;
	private String product_comments;
	private String product_indate;
	
	public ShopProduct() {
		super();
	}

	public ShopProduct(int product_seq, String product_nm, int product_qty, int product_price,
			String product_comments, String product_indate) {
		super();
		this.product_seq = product_seq;
		this.product_nm = product_nm;
		this.product_qty = product_qty;
		this.product_price = product_price;
		this.product_comments = product_comments;
		this.product_indate = product_indate;
	}

	public int getProduct_seq() {
		return product_seq;
	}

	public void setProduct_seq(int product_seq) {
		this.product_seq = product_seq;
	}

	public String getProduct_nm() {
		return product_nm;
	}

	public void setProduct_nm(String product_nm) {
		this.product_nm = product_nm;
	}

	public int getProduct_qty() {
		return product_qty;
	}

	public void setProduct_qty(int product_qty) {
		this.product_qty = product_qty;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getProduct_comments() {
		return product_comments;
	}

	public void setProduct_comments(String product_comments) {
		this.product_comments = product_comments;
	}

	public String getProduct_indate() {
		return product_indate;
	}

	public void setProduct_indate(String product_indate) {
		this.product_indate = product_indate;
	}

	@Override
	public String toString() {
		return "ShopProduct [product_seq=" + product_seq + ", product_nm=" + product_nm + ", product_qty=" + product_qty
				+ ", product_price=" + product_price + ", product_comments=" + product_comments + ", product_indate="
				+ product_indate + "]";
	}
}
