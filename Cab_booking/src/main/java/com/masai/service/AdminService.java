package com.masai.service;

import java.util.List;

import com.masai.entity.Admin;
import com.masai.entity.TripBooking;
import com.masai.exception.AdminExceptions;

public interface AdminService {
	
	public Admin saveAdmin(Admin admin) throws AdminExceptions;
	
	public Admin update(Admin admin) throws AdminExceptions;
	
	public Admin delete(Integer id) throws AdminExceptions;
	
	public List<TripBooking> getAllTrips(Integer customerid) throws AdminExceptions;
	
	public List<TripBooking> getTripsCabwise();
	
	public List<TripBooking> getTripsCustomerwise();
	
	public List<TripBooking> getTripsDatewise() throws AdminExceptions;
	
}
