package com.sbank.service;

import java.util.List;


import com.sbank.model.Users;
import com.sbank.wrapper.UpdateUser;

public interface IUserService {

	public Users createUser(Users user);
	
	public List<Users> readAll();
	
	public Users readOne(String Id);
	
	public List<Users> delete(String Id);

	public Users update(UpdateUser User);
}
