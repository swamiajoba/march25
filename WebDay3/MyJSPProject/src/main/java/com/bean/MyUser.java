package com.bean;

public class MyUser {
	private String uid;
	private String password;
	public MyUser() {
		this.uid="Noname";
		this.password="NoPassword";
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
