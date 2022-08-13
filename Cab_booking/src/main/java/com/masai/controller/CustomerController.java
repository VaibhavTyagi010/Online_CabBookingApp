package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.CustomerService;
import com.masai.entity.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	@GetMapping("/customer/{Id}")
	public Customer getCustomer(@PathVariable("id")Integer id)
	{
		return null;
	}
	
	
	@PostMapping(value = "/save",consumes = "application/json")
	public Customer SaveStudent(@Valid @RequestBody Customer customer)
	{	System.out.println(customer);
		return service.saveCustomer(customer);
	}
	

}
