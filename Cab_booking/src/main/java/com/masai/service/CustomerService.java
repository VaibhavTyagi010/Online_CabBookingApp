package com.masai.service;



import java.util.List;

import com.masai.entity.Customer;
import com.masai.exception.InvalidId;
import com.masai.exception.Nullexception;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	public Customer findCustomer(Integer id)throws InvalidId;
	public Customer updateCustomer(Customer customer,Integer id)throws InvalidId;
	public String deleteCustomer(Integer id)throws InvalidId;
	public List<Customer> allCustomer()throws Nullexception;
	public Customer vaildCustomer(String Email,String Password)throws InvalidId;
	
}
