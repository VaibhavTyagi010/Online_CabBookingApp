package com.masai.service;

import java.util.List;

import com.masai.entity.Cab;
import com.masai.exception.CabNotFoundException;
import com.masai.exception.InvalidId;



public interface CabService {

	public Cab insertCab(Cab cab);
	public Cab updateCab(Cab cab) throws CabNotFoundException;
	public Cab deleteCab(int cabId) throws InvalidId;
	public List<Cab> viewCabsOfType(String carType) throws CabNotFoundException;
	public int countCabsOfType(String carType) throws CabNotFoundException;
	
}

