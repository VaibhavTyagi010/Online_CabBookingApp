package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.entity.Driver;
import com.masai.entity.TripBooking;
@Repository
public interface TripBookingDao extends JpaRepository<TripBooking,Integer> {

}
