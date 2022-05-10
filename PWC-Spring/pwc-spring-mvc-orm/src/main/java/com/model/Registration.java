package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="spring_reg")
public class Registration {
	@Id
	@GeneratedValue
	private int uId;
public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
private String userName;
private String password;
private String email;
private String city;
private String state;
public Registration(int uId, String userName, String password, String email, String city, String state) {
	super();
	this.uId = uId;
	this.userName = userName;
	this.password = password;
	this.email = email;
	this.city = city;
	this.state = state;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
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
@Override
public String toString() {
	return "Registration [uId=" + uId + ", userName=" + userName + ", password=" + password + ", email=" + email
			+ ", city=" + city + ", state=" + state + "]";
}

public Registration() {
	super();
	// TODO Auto-generated constructor stub
}
}