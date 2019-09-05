package com.scmaster.shopping.vo;

public class ShopUser {
	
	private String user_id;
	private String user_pw;
	private String user_nm;
	private String user_gender;
	private String user_indate;
	
	public ShopUser() {
		super();
	}

	public ShopUser(String user_id, String user_pw, String user_nm, String user_gender, String user_indate) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_nm = user_nm;
		this.user_gender = user_gender;
		this.user_indate = user_indate;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_nm() {
		return user_nm;
	}

	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_indate() {
		return user_indate;
	}

	public void setUser_indate(String user_indate) {
		this.user_indate = user_indate;
	}

	@Override
	public String toString() {
		return "ShopUser [user_id=" + user_id + ", user_pw=" + user_pw + ", user_nm=" + user_nm + ", user_gender="
				+ user_gender + ", user_indate=" + user_indate + "]";
	}
}
