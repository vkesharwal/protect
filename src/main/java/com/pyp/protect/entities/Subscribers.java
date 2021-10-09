package com.pyp.protect.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.pyp.protect.pk.SubscriberPK;
@Entity
@IdClass(SubscriberPK.class)
public class Subscribers implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8915679462144154805L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Id
	private String emailId;
	@Id
	private String mobileNum;
	private Timestamp startDate;
	private Timestamp endDate;
	private String subStatus;
	private String planType;
	private String planPrice;
	private String paymentMode;
	private String autoSubscribe; //if Yes, resubscribe when previous subscription ends
	public Subscribers(int iD, String emailId, String mobileNum, Timestamp startDate, Timestamp endDate,
			String subStatus, String planType, String planPrice, String paymentMode, String autoSubscribe) {
		super();
		ID = iD;
		this.emailId = emailId;
		this.mobileNum = mobileNum;
		this.startDate = startDate;
		this.endDate = endDate;
		this.subStatus = subStatus;
		this.planType = planType;
		this.planPrice = planPrice;
		this.paymentMode = paymentMode;
		this.autoSubscribe = autoSubscribe;
	}
	
	 public Subscribers() {
			super();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	public String getSubStatus() {
		return subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getPlanPrice() {
		return planPrice;
	}
	public void setPlanPrice(String planPrice) {
		this.planPrice = planPrice;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getAutoSubscribe() {
		return autoSubscribe;
	}
	public void setAutoSubscribe(String autoSubscribe) {
		this.autoSubscribe = autoSubscribe;
	}
	@Override
	public String toString() {
		return "Subscribers [ID=" + ID + ", emailId=" + emailId + ", mobileNum=" + mobileNum + ", startDate="
				+ startDate + ", endDate=" + endDate + ", subStatus=" + subStatus + ", planType=" + planType
				+ ", planPrice=" + planPrice + ", paymentMode=" + paymentMode + ", autoSubscribe=" + autoSubscribe
				+ "]";
	}
	
}
