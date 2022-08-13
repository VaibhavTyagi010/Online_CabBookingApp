package com.masai.service;

import java.util.List;

import com.masai.entity.Driver;
import com.masai.exception.DriverException;
import com.masai.exception.InvalidId;

public interface DriverService {
public Driver insertDriver(Driver driver);
public Driver viewDriverById(Integer id) throws InvalidId;
public Driver updateDriver(Driver driver)throws DriverException;
public Driver deleteDriver(Driver driver)throws DriverException;
public List<Driver> viewBestDriver()throws DriverException;
}
