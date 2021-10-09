package com.pyp.protect.pk;

import java.io.Serializable;

public class UsersPK implements Serializable{

	
		private static final long serialVersionUID = 1L;
		protected String emailID;
		protected String mobileNum;
		UsersPK(){}
		/*
		 * public UsersPK(String emailId, String mobileNum) { this.emailId=emailId;
		 * this.mobileNum=mobileNum; }
		 */

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((emailID == null) ? 0 : emailID.hashCode());
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
			UsersPK other = (UsersPK) obj;
			if (emailID == null) {
				if (other.emailID != null)
					return false;
			} else if (!emailID.equals(other.emailID))
				return false;
			if (mobileNum == null) {
				if (other.mobileNum != null)
					return false;
			} else if (!mobileNum.equals(other.mobileNum))
				return false;
			return true;
		}

		public String getEmailId() {
			return emailID;
		}

		public void setEmailId(String emailId) {
			this.emailID = emailId;
		}

		public String getMobileNum() {
			return mobileNum;
		}

		public void setMobileNum(String mobileNum) {
			this.mobileNum = mobileNum;
		}

		public UsersPK(String emailId, String mobileNum) {
			super();
			this.emailID = emailId;
			this.mobileNum = mobileNum;
		}
		
}
