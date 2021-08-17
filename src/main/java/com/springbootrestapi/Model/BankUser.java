package com.springbootrestapi.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BankUser {
	@Id
	@GeneratedValue
	private long userId;
	private String userName;
	private String city;
	private long userAcNo;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getUserAcNo() {
		return userAcNo;
	}
	public void setUserAcNo(long userAcNo) {
		this.userAcNo = userAcNo;
	}

}
