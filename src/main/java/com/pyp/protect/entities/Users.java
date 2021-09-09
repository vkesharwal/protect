package com.pyp.protect.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	private long id;
	private String name;
	private String emailID;
	private String mobileNum;
	public Users(long id, String name, String emailID, String mobileNum) {
		super();
		this.id = id;
		this.name = name;
		this.emailID = emailID;
		this.mobileNum = mobileNum;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", emailID=" + emailID + ", mobileNum=" + mobileNum + "]";
	}
	
	
}
