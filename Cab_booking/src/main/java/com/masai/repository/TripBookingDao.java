package com.masai.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.TripBooking;
@Repository
public interface TripBookingDao extends JpaRepository<TripBooking,Integer> {
	public List<TripBooking> findByCustomeridAsce();
	public List<TripBooking> findByDateAsce();
	public List<TripBooking> findByCustomerIdAndDate(Integer customerId, LocalDate date);
}
