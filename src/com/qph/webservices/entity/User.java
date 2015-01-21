package com.qph.webservices.entity;

public class User {
	private String userName;
	private String description;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User(String userName, String description) {
		this.userName = userName;
		this.description = description;
	}
}
