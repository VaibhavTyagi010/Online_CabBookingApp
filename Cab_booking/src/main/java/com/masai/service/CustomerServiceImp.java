package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.repository.CustomerDao;
import com.masai.entity.Customer;


@Service
public class CustomerServiceImp implements CustomerService {
 
	@Autowired
	private CustomerDao cdao;
	
	
	@Override
    	public Customer saveCustomer(Customer customer) {
		
		System.out.println("value+"+customer);
		return cdao.save(customer);
		
		
	}

}
