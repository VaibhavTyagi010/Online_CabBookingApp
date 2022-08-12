package com.masai.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.validation.constraints.Email;


@Entity
public class Abstractuser {
	
	@Size(min = 3, max = 255, message = "{nameRange}")
	@NotNull(message = "{notNull}")
	private String Username;
	
	@Size(min = 4, max = 20, message = "{PasswordRange}")
	@NotNull(message = "{notNull}")
	private String Password;
	
	@Size(min = 10, max=10, message = "{MobileRange}")
	private Long Mobile;
	
	@Size(min = 3, max = 255, message = "{AddressRange}")
	@NotNull(message = "{notNull}")
	private String Address;
	
	@Email
	@NotNull(message = "{notNull}")
	private String Email;

}
