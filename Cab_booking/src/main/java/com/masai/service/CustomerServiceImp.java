package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.repository.CustomerDao;
import com.masai.entity.Customer;
import com.masai.exception.InvalidId;
import com.masai.exception.Nullexception;


@Service
public class CustomerServiceImp implements CustomerService {
 
	@Autowired
	private CustomerDao cdao;
	
	
	@Override
    	public Customer saveCustomer(Customer customer) {
		return cdao.save(customer);
	}


	@Override
	public Customer findCustomer(Integer id) throws InvalidId {
	

		Customer ct=cdao.findById(id).orElseThrow(() -> new InvalidId("Customer with ID "+id+" does not exit.."));
		
		
		return ct;
		
	}
	@Override
	public Customer updateCustomer(Customer customer) throws InvalidId {
		Integer id=customer.getUserId();
		Customer c1=cdao.getById(id);
		
		System.out.println(c1.getUserId());
		c1.setAddress(customer.getAddress());
		c1.setEmail(customer.getEmail());
		c1.setMobile(customer.getMobile());
		c1.setPassword(customer.getPassword());
		c1.setUsername(customer.getUsername());
            cdao.save(c1);		
		return c1;
	}


	@Override
	public String deleteCustomer(Integer id) throws InvalidId {
		// TODO Auto-generated method stub
		
		
		Customer ct=cdao.findById(id).orElseThrow(() -> new InvalidId("Customer with ID "+id+" does not exit.."));
		cdao.delete(ct);
		
		return "delete...";
	}


	@Override
	public List<Customer> allCustomer() throws Nullexception {
		List<Customer> c1  =cdao.findAll();
		if(c1.size()==0)
			throw new Nullexception("EMPTY NO DATA AVAILABLE");
		return c1;
	}


	@Override
	public Customer vaildCustomer(String Email, String Password) throws InvalidId {
		// TODO Auto-generated method stub
		
		List<Customer> c1  =cdao.findAll();
		for(int i= 0; i < c1.size(); i++) {
			if(c1.get(i).getEmail().equals(Email) && c1.get(i).getPassword().equals(Password))
			     return c1.get(i);
			}
		 throw new InvalidId("Invalid Email and password");
	}





	

}
