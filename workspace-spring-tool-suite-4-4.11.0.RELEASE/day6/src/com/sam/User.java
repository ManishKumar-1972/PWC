package com.sam;

import java.io.Serializable;
import java.util.Objects;

public class User {

		private int userId;
		private String userName;
		private String email;
		private String city;
		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + "]";
		}
		
		public User(int userId, String userName, String email) {
			this.userId = userId;
			this.userName = userName;
			this.email = email;
			
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}	

	}



