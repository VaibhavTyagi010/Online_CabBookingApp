package com.masai.entity;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class Abstractuser implements Serializable {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@EqualsAndHashCode.Include
	private Integer userId;
	
	@Size(min = 3, max = 255, message = "{nameRange}")
	@NotNull(message = "{notNull}")
	private String Username;
	
	@Size(min = 4, max = 20, message = "{PasswordRange}")
	@NotNull(message = "{notNull}")
	private String Password;
	


	@Size(min = 10, message = "{MobileRange}")
	private String Mobile;


	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private Address address;
	
	@Email
	@NotNull(message = "{notNull}")
	private String Email;

}
