package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Driver;
import com.masai.repository.DriverDao;
@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverDao dDao;
	
	@Override
	public Driver insertDriver(Driver driver) {
		Driver savedDriver= dDao.save(driver);
		return savedDriver;
	}

	
	

}
