package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	private int lid;
	private String email;
	private String password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(int lid, String email, String password) {
		super();
		this.lid = lid;
		this.email = email;
		this.password = password;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
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
		return "Login [lid=" + lid + ", email=" + email + ", password=" + password + "]";
	}
	
}