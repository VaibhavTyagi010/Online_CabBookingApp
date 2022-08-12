package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class AbstractUser {
	private String username;
	private String password;
	private String Mobile;
	private Address address;
	@Id
	private String email;
	
}
