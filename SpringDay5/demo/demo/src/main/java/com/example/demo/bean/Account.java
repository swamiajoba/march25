package com.example.demo.bean;

public class Account {
	private int eid;
	private String customer;
	private double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int eid, String customer, double balance) {
		super();
		this.eid = eid;
		this.customer = customer;
		this.balance = balance;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [eid=" + eid + ", customer=" + customer + ", balance=" + balance + "]";
	}
	
}
