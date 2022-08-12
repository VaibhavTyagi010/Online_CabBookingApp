package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Driver;
@Repository
public interface DriverDao extends JpaRepository<Driver,Integer> {

}
