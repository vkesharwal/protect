package com.pyp.protect.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	private long id;
	private String name;
	private String emailID;
	private String mobileNum;
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	private String status;
	public Users(long id, String name, String emailID, String mobileNum) {
		super();
		this.id = id;
		this.name = name;
		this.emailID = emailID;
		this.mobileNum = mobileNum;
		this.createdDate=new java.sql.Timestamp(System.currentTimeMillis());
		this.modifiedDate=new java.sql.Timestamp(System.currentTimeMillis());
		this.status="CREATED";
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
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	/*
	 * @Override public String toString() { return "Users [id=" + id + ", name=" +
	 * name + ", emailID=" + emailID + ", mobileNum=" + mobileNum + "]"; }
	 */
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", emailID=" + emailID + ", mobileNum=" + mobileNum
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", status=" + status + "]";
	}
	
	
}
