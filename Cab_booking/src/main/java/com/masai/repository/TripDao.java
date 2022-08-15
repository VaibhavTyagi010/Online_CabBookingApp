package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.TripBooking;


@Repository
public interface TripDao extends JpaRepository<TripBooking,Integer> {

}
