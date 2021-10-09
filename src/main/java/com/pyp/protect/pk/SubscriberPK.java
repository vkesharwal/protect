package com.pyp.protect.pk;

import java.io.Serializable;

public class SubscriberPK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String emailId;
	protected String mobileNum;
	SubscriberPK(){}
	/*
	 * public SubscriberPK(String emailId, String mobileNum) { this.emailId=emailId;
	 * this.mobileNum=mobileNum; }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((mobileNum == null) ? 0 : mobileNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubscriberPK other = (SubscriberPK) obj;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (mobileNum == null) {
			if (other.mobileNum != null)
				return false;
		} else if (!mobileNum.equals(other.mobileNum))
			return false;
		return true;
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

	public SubscriberPK(String emailId, String mobileNum) {
		super();
		this.emailId = emailId;
		this.mobileNum = mobileNum;
	}
	

	/*
	 * public static boolean equals(SubscriberPK subPk) { return true; }
	 */
}
