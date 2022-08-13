package com.masai.entity;



import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Abstractuser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	@Size(min = 3, max = 255, message = "{nameRange}")
	@NotNull(message = "{notNull}")
	private String Username;
	
	@Size(min = 4, max = 20, message = "{PasswordRange}")
	@NotNull(message = "{notNull}")
	private String Password;
	
	@Size(min = 10, message = "{MobileRange}")
	private Long Mobile;
	
	private Address address;
	
	@Email
	@NotNull(message = "{notNull}")
	private String Email;

}
