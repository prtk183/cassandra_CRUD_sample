package com.sbank.wrapper;

import com.sbank.model.Users;

public class UpdateUser {

	String Id;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	Users user;
}
