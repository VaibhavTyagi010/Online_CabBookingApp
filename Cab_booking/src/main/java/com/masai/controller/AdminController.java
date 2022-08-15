package com.masai.controller;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Admin;
import com.masai.entity.Cab;
import com.masai.entity.TripBooking;
import com.masai.service.AdminServiceImp;
@RestController
public class AdminController {
	@Autowired
	private AdminServiceImp adminService;
	
	@PostMapping("/admin")
	public Admin insertAdmin(@RequestBody Admin admin) {
		return adminService.saveAdmin(admin);
	}
	
	
	@PutMapping("/admin/{adminId}")
	public Admin updateAdmin(@RequestBody Admin admin, @PathVariable("adminId") int adminId) {
		return adminService.update(admin); 
		
	}
	
	@DeleteMapping("/admin/{adminId}")
	public Admin deleteMapping(@PathVariable("adminId") Integer adminId) {
		return adminService.delete(adminId);
	}
	
	@GetMapping("/trips/{customerId}")
	public List<TripBooking> getAllTrips(@PathVariable("customerId") Integer customerId){
		
		return adminService.getAllTrips(customerId);
	}
	
	@GetMapping("trips/{cab}")
	public List<TripBooking> getTripsCabwise(@RequestBody Cab cab){
		
		return adminService.getTripsCabwise(cab);
	}
	
	@GetMapping("trips/customers")
	public List<TripBooking> getTripsCustomerwise(){
		
		return adminService.getTripsCustomerwise();
	}
	
	@GetMapping("trips/dates")
	public List<TripBooking> getTripsDatewise(){
		
		return adminService.getTripsDatewise();
	}
	
	@GetMapping("trips/{customerId}/{Date}")
	public List<TripBooking> getAllTripsForDays(@PathVariable("customerId") Integer customerId, @PathVariable("fromDate") LocalDate dateDate){
		
		return adminService.getTripsDatewiseAndCustomer(customerId,dateDate);
	}
}
