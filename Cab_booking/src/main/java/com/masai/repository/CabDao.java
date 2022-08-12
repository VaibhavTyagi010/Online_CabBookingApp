package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.entity.Cab;

public interface CabDao extends JpaRepository<Cab, Integer> {

}
