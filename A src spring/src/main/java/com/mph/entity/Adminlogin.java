package com.mph.entity;
import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class Adminlogin {
	
	@Id
	private int aid;
	private String email;
	private String password;
	
	
	
	public Adminlogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adminlogin(int aid, String email, String password) {
		super();
		this.aid = aid;
		this.email = email;
		this.password = password;
	}

	public int getLid() {
		return aid;
	}
	public void setLid(int aid) {
		this.aid = aid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Adminlogin [aid=" + aid + ", email=" + email + ", password=" + password + "]";
	}


}
