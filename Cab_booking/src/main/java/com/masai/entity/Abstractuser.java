package com.masai.entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.validation.constraints.Email;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
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
	@Id
	private String Email;

}
