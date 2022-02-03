package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
  private String cname;
  private String email;
	private String password;
	private int phoneno;
	private int aadharno;
	private int panno;
	private String gender;
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int cid, String cname, String email, String password, int phoneno, int aadharno, int panno,
			String gender) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.password = password;
		this.phoneno = phoneno;
		this.aadharno = aadharno;
		this.panno = panno;
		this.gender = gender;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public int getAadharno() {
		return aadharno;
	}
	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	public int getPanno() {
		return panno;
	}
	public void setPanno(int panno) {
		this.panno = panno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", password=" + password
				+ ", phoneno=" + phoneno + ", aadharno=" + aadharno + ", panno=" + panno + ", gender=" + gender + "]";
	}
	


}
