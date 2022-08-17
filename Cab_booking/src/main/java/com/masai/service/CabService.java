package com.masai.service;

import java.util.List;

import com.masai.entity.Cab;
import com.masai.exception.NotFoundException;
import com.masai.exception.InvalidId;



public interface CabService {

public Cab updateCab(Integer id,String type, Integer rate) throws NotFoundException;
	
	public List<String> viewCabsOfType() throws NotFoundException;
	public int countCabsOfType() throws NotFoundException;
	
}

