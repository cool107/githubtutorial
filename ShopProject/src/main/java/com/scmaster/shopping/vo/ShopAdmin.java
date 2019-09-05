package com.scmaster.shopping.vo;

public class ShopAdmin {
	private String admin_id;
	private String admin_pw;
	private String admin_indate;
	
	public ShopAdmin() {
		super();
	}

	public ShopAdmin(String admin_id, String admin_pw, String admin_indate) {
		super();
		this.admin_id = admin_id;
		this.admin_pw = admin_pw;
		this.admin_indate = admin_indate;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_pw() {
		return admin_pw;
	}

	public void setAdmin_pw(String admin_pw) {
		this.admin_pw = admin_pw;
	}

	public String getAdmin_indate() {
		return admin_indate;
	}

	public void setAdmin_indate(String admin_indate) {
		this.admin_indate = admin_indate;
	}

	@Override
	public String toString() {
		return "ShopAdmin [admin_id=" + admin_id + ", admin_pw=" + admin_pw + ", admin_indate=" + admin_indate + "]";
	}
}
