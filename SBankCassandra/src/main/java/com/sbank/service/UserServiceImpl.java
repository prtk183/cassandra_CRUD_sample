package com.sbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbank.model.Users;
import com.sbank.repository.UserRepository;
import com.sbank.wrapper.UpdateUser;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Users createUser(Users user) {
		
		Users users= userRepository.save(user);
		return users;
	}

	@Override
	public List<Users> readAll() {
		// TODO Auto-generated method stub
		
		return userRepository.findAll();
	}

	@Override
	public Users update(UpdateUser user) {
		// TODO Auto-generated method stub
		Users user3 =(Users) userRepository.findById(user.getId()).get();
		user3.setAge(user.getUser().getAge());
    	user3.setEmail(user.getUser().getEmail());
    	user3.setName(user.getUser().getName());
    	user3.setId(user.getId());
		return userRepository.save(user3);
	}

	@Override
	public List<Users> delete(String Id) {
		// TODO Auto-generated method stub
		Users entity = (Users) userRepository.findById(Id).get();
    	userRepository.deleteById(entity.getId());
    	//userRepository.deleteById(Id);
    	
		return userRepository.findAll();
	}

	@Override
	public Users readOne(String Id) {
		Users user = (Users) userRepository.findById(Id).get();
		
		return user;
	}

}
