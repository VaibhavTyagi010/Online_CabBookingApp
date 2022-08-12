package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer> {

}
