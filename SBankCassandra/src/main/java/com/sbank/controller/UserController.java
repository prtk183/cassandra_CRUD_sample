package com.sbank.controller;

import java.util.List;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.sbank.model.Users;
import com.sbank.repository.UserRepository;
import com.sbank.service.UserServiceImpl;
import com.sbank.wrapper.UpdateUser;

	@RestController
	@RequestMapping("/user")
	public class UserController {

	    @Autowired
	    UserServiceImpl userServiceImpl;
	    
	    @PostMapping("/create")
	    public ResponseEntity<Users> create(@RequestBody Users user) {
	        Users users =userServiceImpl.createUser(user);
	        return new ResponseEntity<Users>(users, HttpStatus.OK);
	    }

	    @GetMapping(value = "/readall") 
	    public ResponseEntity<List<Users>> readAll() {
	        List<Users> Users = userServiceImpl.readAll();
	        return new ResponseEntity<List<Users>>(Users, HttpStatus.OK);
	    }
	    
	    @GetMapping(value = "/read/{id}") 
	    public ResponseEntity<Users> read(@PathVariable String id) {
	        Users user2 = userServiceImpl.readOne(id);
	        return new ResponseEntity<Users>(user2, HttpStatus.OK);

	    }
	    
	    @PostMapping("/update")
	    public ResponseEntity<Users> update(@RequestBody UpdateUser user) {
	    	Users user3 = userServiceImpl.update(user);
	 	        return new ResponseEntity<Users>(user3, HttpStatus.OK);

	    }

	    @DeleteMapping("/delete") 
	    public ResponseEntity<List<Users>> delete(@RequestParam("id") String Id) {
	        System.out.println("inside Deleted");
	    	List<Users> list = userServiceImpl.delete(Id);
	        return new ResponseEntity<List<Users>>(list, HttpStatus.OK);
	    }

	}

