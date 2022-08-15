package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Admin;


@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {
	public Admin findByUserName(String userName);
	
//	@Query("from Course c where c.cname=?1")
//	public Course getCourseByName(String cname);
}
