package com.masai.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Admin;
import com.masai.entity.Cab;
import com.masai.entity.Customer;
import com.masai.entity.TripBooking;
import com.masai.exception.AdminExceptions;
import com.masai.repository.AdminDao;
import com.masai.repository.CustomerDao;


@Service
public class AdminServiceImp implements AdminService {
	@Autowired
	private AdminDao aDao;

	@Autowired
	private CustomerDao cDao;

	@Override
	public Admin saveAdmin(Admin admin) throws AdminExceptions {
		return aDao.save(admin);
	}

	
	public Admin update(Admin admin) throws AdminExceptions {
		Optional<Admin> opt = aDao.findById(admin.getUserId());
		if (opt.isPresent()) {
//			Admin existAdmin = opt.get();
			return aDao.save(admin);
		}
		throw new AdminExceptions("Invalid Id");
	}

	@Override
	public Admin delete(Integer id) throws AdminExceptions {
		Admin existingAdmin = aDao.findById(id).orElseThrow(() -> new AdminExceptions("Invalid Id"));
		aDao.delete(existingAdmin);

		return existingAdmin;
	}

	@Override
	public List<TripBooking> getAllTrips(Integer customerid) throws AdminExceptions {
		//customer exception
		cDao.
	}

	@Override
	public List<TripBooking> getTripsCabwise(Cab cab) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getTripsCustomerwise(Integer customerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getTripsDatewise(LocalDate date) throws AdminExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getTripsDatewiseAndCustomer(Integer customerId, LocalDate date) throws AdminExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getTripsDatewise() {
		// TODO Auto-generated method stub
		return null;
	}

}
