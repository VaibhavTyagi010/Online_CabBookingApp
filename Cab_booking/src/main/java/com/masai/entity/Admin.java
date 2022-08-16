package com.masai.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor

@PrimaryKeyJoinColumn(name="adminId")
public class Admin extends Abstractuser {

}
