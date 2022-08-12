package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.masai.entity.Driver;
import com.masai.service.DriverService;

@Controller
public class DriverController {
@Autowired
private DriverService dService;

@PostMapping("/drivers")
public ResponseEntity<Driver> insertDriver(@Valid @RequestBody Driver driver){
	Driver addedDriver= dService.insertDriver(driver);
	return new ResponseEntity<Driver>(addedDriver,HttpStatus.ACCEPTED);
}
@GetMapping("/drivers/{id}")
public ResponseEntity<Driver> viewDriverById(@PathVariable("id") Integer id){
	Driver foundDriver= dService.viewDriverById(id);
	return new ResponseEntity<Driver>(foundDriver,HttpStatus.ACCEPTED);
}
@PutMapping("/drivers")
public String updateDriver(@Valid @RequestBody Driver driver) {
	Driver updateddriver=dService.updateDriver(driver);
	return "Driver updated "+updateddriver;
}
@DeleteMapping("/drivers")
public String deleteDriver(@Valid @RequestBody Driver driver) {
	Driver deletedDriver=dService.deleteDriver(driver);
	return "Driver deleted "+deletedDriver;
}
@GetMapping("/topDrivers")
public ResponseEntity<List<Driver>> viewBestDrivers(){
	List<Driver> list=dService.viewBestDriver();
	return new ResponseEntity<List<Driver>>(list,HttpStatus.ACCEPTED);
}
}
