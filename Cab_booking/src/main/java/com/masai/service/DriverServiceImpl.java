package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Cab;
import com.masai.entity.Driver;
import com.masai.exception.DriverException;
import com.masai.exception.InvalidId;
import com.masai.repository.CabDao;
import com.masai.repository.DriverDao;
@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverDao dDao;
	
	@Autowired
	private CabDao cDao;
	
	@Override
	public Driver insertDriver(Driver driver) {
		Cab cab= driver.getCab();
		cDao.save(cab);
		Driver savedDriver= dDao.save(driver);
		return savedDriver;
	}

	@Override
	public Driver viewDriverById(Integer id) throws InvalidId {
		if(id<1)
			throw new InvalidId("Id should be more than 1");
		
		Optional<Driver> opt=dDao.findById(id);
		
		return opt.orElseThrow(() -> new DriverException("No Driver found for id: "+id));
	}

	@Override
	public Driver updateDriver(Driver driver) throws DriverException{
		Optional<Driver> opt= dDao.findById(driver.getId());
		if(opt.isPresent())
			return dDao.save(driver);
		else
			throw new DriverException("No Driver found ");
	}

	@Override
	public Driver deleteDriver(Driver driver) throws DriverException{
		Optional<Driver> opt=dDao.findById(driver.getId());
		if(opt.isPresent()) {
			dDao.delete(driver);
			return driver;
		}
		else
			throw new DriverException("No Driver found ");
	}

	@Override
	public List<Driver> viewBestDriver() throws DriverException {
		List<Driver> drivers= dDao.viewBestDriver();
		if(drivers.size()>0)
			return drivers;
		else
			throw new DriverException("No Driver found with rating>=4.5");
	}

	
	

}
