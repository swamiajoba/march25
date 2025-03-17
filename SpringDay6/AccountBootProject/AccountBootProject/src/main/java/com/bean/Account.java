package com.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Id
	private int aid;
	
	@Column(name="holder")
	private String customer;
	
	private double balance;
	
	private String email;
	
	public Account() {
		
	}

	public Account(int aid, String customer, double balance, String email) {
		super();
		this.aid = aid;
		this.customer = customer;
		this.balance = balance;
		this.email = email;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
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
		return "Account [aid=" + aid + ", customer=" + customer + ", balance=" + balance + ", email=" + email + "]";
	}

}
