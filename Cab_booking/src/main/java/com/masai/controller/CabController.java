package com.masai.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Cab;
import com.masai.service.CabService;

@RestController
public class CabController {

	private CabService cService;
	
	@PostMapping("/cabs")
	public Cab insertCabHandler(@RequestBody Cab cab)
	{
		return cService.insertCab(cab);
		
	}
	
	
	@DeleteMapping("/cabs/{cabId}")
	public Cab deleteHandler(@PathVariable int cabId)
	{
		
	   return	cService.deleteCab(cabId);
	
		
	}
	
	@PutMapping("/cabs")
    public ResponseEntity<Cab> updateCabHandler(@RequestBody Cab cab)
    {
		
		Cab updatedCab = cService.updateCab(cab);
		return new ResponseEntity<Cab>(updatedCab,HttpStatus.ACCEPTED);
		
    	
    }
	
	@GetMapping("/cabs/{cabId}")
	public ResponseEntity<List<Cab>> viewCabsHandler(@RequestBody String carType)
	{
		
		List<Cab> cabs = cService.viewCabsOfType(carType);
		
        return new ResponseEntity<List<Cab>>(cabs,HttpStatus.OK);
		
	}
	
     public int countCabsOfType(@PathVariable String carType)
     {
    	return cService.countCabsOfType(carType); 
     }
	
	
	
}
