package com.masai.service;

import com.masai.entity.CustomerDTO;

public interface UserLogIn {
	
	public String logIntoAccount(CustomerDTO userDto);
	
	public String logOutFromAccount(String key);
}
