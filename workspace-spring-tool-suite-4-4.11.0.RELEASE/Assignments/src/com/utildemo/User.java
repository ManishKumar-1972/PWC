package com.utildemo;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable, Comparable<User> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		

		@Override
		public int hashCode() {
			return Objects.hash(city, email, userId, userName);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			if(city == null) {
				if(other.city != null)
					return false;
			} else if(!city.equals(other.city))
				return false;
			
			if(email == null) {
				if(other.email != null)
					return false;
			} else if(!email.equals(other.email))
				return false;
			
			if(userId != other.userId) {
				return false;
			}
			
			if(userName == null) {
				if(other.userName != null)
					return false;
			} else if(!userName.equals(other.userName))
				return false;
			return true;
		}
			
		

		@Override
		public int compareTo(User o) {
			return this.getUserName().compareTo(o.getUserName());
		}

	}



