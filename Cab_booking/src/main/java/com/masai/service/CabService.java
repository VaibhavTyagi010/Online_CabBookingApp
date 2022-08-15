package com.masai.service;

import java.util.List;

import com.masai.entity.Cab;
import com.masai.exception.CabNotFoundException;
import com.masai.exception.InvalidId;



public interface CabService {

public Cab updateCab(Integer id,String type, Integer rate) throws CabNotFoundException;
	
	public List<String> viewCabsOfType() throws CabNotFoundException;
	public int countCabsOfType() throws CabNotFoundException;
	
}

