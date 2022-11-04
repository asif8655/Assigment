package com.six.assigment.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.six.assigment.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, String> {
	
	
	public List<Customer> findByEmail(String email);
	
	public List<Customer> findByMobileNo(String mobileNo);
	
}
