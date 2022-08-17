package com.masai.entity;

import lombok.Data;

@Data
public class CustomerDTO {
	private Integer userId;
	
//	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,12}$",message = "{password.invalid}") 
	private String password;
}
