package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.entity.Driver;
@Repository
public interface DriverDao extends JpaRepository<Driver,Integer> {
@Query("select * from Driver d where d.rating>=4.5")
public List<Driver> viewBestDriver();
}
