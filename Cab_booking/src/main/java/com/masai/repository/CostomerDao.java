package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Costomer;



@Repository
public interface CostomerDao extends JpaRepository<Costomer, Integer> {

}
