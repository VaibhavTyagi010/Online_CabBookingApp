package com.masai.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.ToString;

@Entity 
@ToString
@Data
@PrimaryKeyJoinColumn(name="CustomerID")
public class Customer extends Abstractuser {
    		
}
