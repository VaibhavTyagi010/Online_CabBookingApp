package com.masai.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data 
@Inheritance(strategy = InheritanceType.JOINED)
public class Abstractuser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@EqualsAndHashCode.Include
	 private Integer Id;
    
    private boolean journey_status;
    
    
    @Size(min = 3, max = 255, message = "{name Range}")
    @NotNull(message = "{name not Null}")
    @Pattern(regexp="^[A-Z][a-z]*")
    private String Username;

    @Size(min = 4, max = 20, message = "{Password Range}")
    @NotNull(message = "{ password not Null}")
    private String Password;

    //@Size(min = 10, max=14,message = "{Mobile Range}")
    private Long Mobile;

   @Size(min = 3, max = 255, message = "{Adress Range}")
   @NotNull(message = "{Address not Null}")
    private String Address;

   @javax.validation.constraints.Email
   @NotNull(message = "{Email not Null}")
   private String Email;
}
