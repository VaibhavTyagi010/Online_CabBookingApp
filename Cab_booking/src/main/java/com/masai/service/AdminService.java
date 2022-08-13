package com.masai.service;

import java.time.LocalDate;
import java.util.List;

import com.masai.entity.Admin;
import com.masai.entity.Cab;
import com.masai.entity.TripBooking;
import com.masai.exception.AdminExceptions;

import antlr.collections.List;

public interface AdminService {
<<<<<<< HEAD
//	public Admin saveAdmin(Admin admin) throws InvalidDetails;
//	
//	public Admin update(Admin admin) throws InvalidDetails;
//	
//	public Admin delete(Integer id) throws AdminNotFound;
//	
//	public List<TripBooking> getAllTrips(Integer customerid) throws InvalidId;
//	
//	public List<TripBooking> getTripsCabwise();
//	
//	public List<TripBooking> getTripsCustomerwise();
//	
//	public List<TripBooking> getTripsDatewise();
//	
=======


	public Admin saveAdmin(Admin admin) throws InvalidDetails;

	
	public Admin saveAdmin(Admin admin) throws AdminExceptions;
	
	public Admin update(Admin admin) throws AdminExceptions;
	
	public Admin delete(Integer id) throws AdminExceptions;
	
	public List<TripBooking> getAllTrips(Integer customerid) throws AdminExceptions;
	
	public List<TripBooking> getTripsCabwise(Cab cab);
	
	public List<TripBooking> getTripsCustomerwise(Integer customerid);
	
	public List<TripBooking> getTripsDatewise(LocalDate date) throws AdminExceptions;
	
	public List<TripBooking> getTripsDatewiseAndCustomer(Integer customerId,LocalDate date) throws AdminExceptions;
	


	public List<TripBooking> getTripsDatewise();

	
>>>>>>> bb95fae338d0f146621129bedae351db5fa025ca
}
