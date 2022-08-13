package com.masai.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name="adminId")
public class Admin extends Abstractuser {

}
