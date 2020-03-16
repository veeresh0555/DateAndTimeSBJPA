package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.model.Custrequest;
import com.example.service.CustomerService;

@RestController
public class TestController {

	
	@Autowired
	CustomerService custservice;
	
	@PostMapping("/custsave")
	public Customer savecustomer(Custrequest cust) {
		
		Customer custsave= custservice.savecust(cust);
		
		return custsave;
	}
	
	
}
