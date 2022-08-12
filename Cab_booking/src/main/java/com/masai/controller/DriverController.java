package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.masai.entity.Driver;
import com.masai.service.DriverService;

@Controller
public class DriverController {
@Autowired
private DriverService dService;

@PostMapping("/drivers")
public ResponseEntity<Driver> insertDriver(@RequestBody Driver driver){
	Driver addedDriver= dService.insertDriver(driver);
	return new ResponseEntity<Driver>(addedDriver,HttpStatus.ACCEPTED);
}
}
