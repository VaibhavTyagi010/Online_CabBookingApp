package com.masai.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.masai.entity.Customer;



@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer>{
	
}


