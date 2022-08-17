package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Cab;
import com.masai.entity.Driver;
import com.masai.exception.NotFoundException;
import com.masai.exception.InvalidId;
import com.masai.repository.CabDao;
import com.masai.repository.DriverDao;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service("CabService")
public class CabServiceImpl implements CabService {

	@Autowired
	private CabDao cDao;
	

	@Autowired
	private DriverDao dDao;




	@Override
	public Cab updateCab(Integer id,String type, Integer rate) throws NotFoundException {
		// TODO Auto-generated method stub
		java.util.Optional<Cab> opt = cDao.findById(id);
	
		  if(opt.isPresent())
		  {
			  Cab fCab=opt.get();
				fCab.setCarType(type);
				fCab.setRatePerKm(rate);
				Driver fDriver= fCab.getDriver();
				fDriver.setCab(fCab);;
				dDao.save(fDriver);
				return cDao.save(fCab);
			  
			  
			  /*
			  //Driver driver = dDao.getDriverByCabId(cab.getCabId());
		
			  Cab cab1 = opt.get();
			  Driver cabDriver=cab1.getDriver();
			  cabDriver.setCab(cab1);
			  dDao.save(cabDriver);
			 return cDao.save(cab1);*/
			  
			  
		  }else
		  {
			  throw new NotFoundException("Cab Not Found");
		  }
		 

			

	}

	

	@Override
	public List<String> viewCabsOfType() throws NotFoundException {
		// TODO Auto-generated method stub
		List<String> cabs = cDao.viewCarType();
		return cabs;
	}

	@Override
	public int countCabsOfType() throws NotFoundException {
		// TODO Auto-generated method stub
		List<Cab> listcab = cDao.findAll();
		return listcab.size();
	}
	
	



	
	
}
