package com.shop.shop.models;

import org.springframework.stereotype.Component;

/**
 * This class will have user information
 * @author adi
 *
 */

@Component
public class User {
	
	private String userId;
	private String name;
	private String mobileNumber;
	private String userType;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
