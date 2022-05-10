package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.model.Login;
import com.model.Registration;
import com.model.Student;
import com.service.AppService;

public class StudentController {
	
	@Autowired
	private AppService service;
	

    @GetMapping("/loadstudents")
	public List<Student> sayHello() {
    	
    	List<Registration> lst = service.loadAll();
		return lst;
	}


    @PostMapping("/login")
	public String login(@RequestBody Login login) {
		if(service.loginValid(login )) {
			return "Login Success";
		}
		return "Login Failure";
	}
	

    @PostMapping("/register")
	public String register(@RequestBody Registration registeration) {
		registeration.getUserName();
		registeration.getPassword();
		registeration.getCity();
		registeration.getEmail();
		service.addUser(registeration);
		return "Register Success";
	}
    
    @GetMapping("/finduser/{id}")
	public String findUser(@PathVariable ("id")int id) {
		if(service.findUser(id)) {
			return id + " found";
		}
		return "Not Found";
	}
    
    @DeleteMapping("/deletuser/{id}")
	public String deleteUser(@PathVariable ("id")int id) {
		if(service.deleteUser(id)) {
			return id + " found and deleted";
		}
		return "Not Found";
	}
    
    @PutMapping("/updateuser/{uId}")
    public String updateUser(@RequestBody Registration reg, @PathVariable("uId") int id) {
    	if(service.updateUser(reg, id))
    	    return id + " updated";
    	else
    		return id + " not updated";
    }
}