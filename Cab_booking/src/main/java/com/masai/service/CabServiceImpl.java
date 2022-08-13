package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Cab;
import com.masai.exception.CabNotFoundException;
import com.masai.exception.InvalidId;
import com.masai.repository.CabDao;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service("CabService")
public class CabServiceImpl implements CabService {

	@Autowired
	private CabDao cDao;

	@Override
	public Cab insertCab(Cab cab) {
		// TODO Auto-generated method stub
		Cab insertCab = cDao.save(cab);
		return insertCab;
	}

	@Override
	public Cab updateCab(Cab cab) throws CabNotFoundException {
		// TODO Auto-generated method stub
		java.util.Optional<Cab> opt = cDao.findById(cab.getCabId());
		
		  if(opt.isPresent())
		  {
			  Cab cab1 = opt.get();
			  cDao.save(cab1);
		  }
			return cab;
	}

	@Override
	public Cab deleteCab(int cabId) throws InvalidId {
		// TODO Auto-generated method stub
		Cab cab = cDao.findById(cabId).orElseThrow();
		cDao.delete(cab);
		return cab;
	}

	@Override
	public List<Cab> viewCabsOfType(String carType) throws CabNotFoundException {
		// TODO Auto-generated method stub
		List<Cab> cabs = cDao.findAll();
		return cabs;
	}

	@Override
	public int countCabsOfType(String carType) throws CabNotFoundException {
		// TODO Auto-generated method stub
		List<Cab> listcab = cDao.findAll();
		return listcab.size();
	}





	
	
}
