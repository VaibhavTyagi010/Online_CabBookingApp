package com.masai.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Cab {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer cabId;
private String carType;
private Integer ratePerKm;

@OneToOne(optional=false, cascade=CascadeType.ALL)
@JoinColumn(name="userId")
@JsonIgnore
private Driver driver;
}
