package com.masai.model;

public class Demo {
	public static void main(String[] args) {
		Admin admin = new Admin() ;
		admin.setAdminId(1);
		admin.setMobile("655654");
		admin.setPassword("45465");
		admin.setUsername("ram");
		admin.setAddress(new Address("raipur","raipur","cg"));
		
		
		
	}
}
