package com.masai.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data 
@Inheritance(strategy = InheritanceType.JOINED)
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

	
	private Address address;
	
	@javax.validation.constraints.Email
	@NotNull(message = "{notNull}")
	private String Email;

    //@Size(min = 10, max=14,message = "{Mobile Range}")
    private Long Mobile;

}
