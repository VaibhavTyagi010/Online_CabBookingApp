package com.masai.entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@Entity
<<<<<<< HEAD
@PrimaryKeyJoinColumn(name="email")
public class Admin extends Abstractuser{
	@Id
	private Integer adminId;
=======
@PrimaryKeyJoinColumn(name="adminId")
public class Admin extends Abstractuser {

>>>>>>> bb95fae338d0f146621129bedae351db5fa025ca
}
