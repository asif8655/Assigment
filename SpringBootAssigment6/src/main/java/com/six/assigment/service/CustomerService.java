package com.six.assigment.service;

import java.util.Optional;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.six.assigment.entity.Customer;
import com.six.assigment.repo.CustomerRepo;

@Service
public class CustomerService {
	
	
	
	@Autowired
	private CustomerRepo customerRepo;
	
	//To Resister user
	public boolean insertCustomer(Customer customer) throws EntityExistsException{
		
		//customer=asif8655,asif@gmai.com,12393223

		
		Customer persistcus=null;
		if(this.customerRepo.existsById(customer.getUserName())) {
			
		  Optional<Customer> optpersistcus=this.customerRepo.findById(customer.getUserName());
		  if(optpersistcus.isPresent()) 
			  persistcus=optpersistcus.get();
		  
		}
		
		else if(!this.customerRepo.findByEmail(customer.getEmail()).isEmpty()){

				persistcus=this.customerRepo.findByEmail(customer.getEmail()).get(0);
		}else if(!this.customerRepo.findByMobileNo(customer.getMobileNo()).isEmpty()) {

			persistcus=this.customerRepo.findByMobileNo(customer.getMobileNo()).get(0);
		}
		

		if(persistcus!=null)
		{
			if(persistcus.getUserName().equals(customer.getUserName()))
			{
				throw new EntityExistsException("Customer with this username Already Exists");
			}else if(persistcus.getEmail().equals(customer.getEmail())) {
				
				throw new EntityExistsException("Customer with this Email Already Exists");
			}
			else if(persistcus.getMobileNo().equals(customer.getMobileNo())) {
				throw new EntityExistsException("Customer with this Mobile number Already Exists");
			}
			throw new EntityExistsException("Something Went Wrong");
	}
			else {
				this.customerRepo.save(customer);
				return true;
		}
				
			
	}
	
	public boolean loginCustomer(String userName,String password) {
		if(this.customerRepo.existsById(userName)) {
			Optional<Customer> customer = this.customerRepo.findById(userName);
			if(customer.isPresent())
			{
				String pass=customer.get().getPassword();
				if(pass!=null&&pass.equals(password)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void updateCustomer(String email,String mobileNo,String userName) {
		Customer persistcus=null;
	
		Optional<Customer> optcustomer=	this.customerRepo.findById(userName);
		if(optcustomer.isPresent()) {
		 Customer customer = optcustomer.get();
		
		if(!this.customerRepo.findByEmail(email).isEmpty()){

			persistcus=this.customerRepo.findByEmail(email).get(0);
	}else if(!this.customerRepo.findByMobileNo(mobileNo).isEmpty()) {

		persistcus=this.customerRepo.findByMobileNo(mobileNo).get(0);
	}
		
		if(persistcus!=null) {
		if(customer.getEmail().equals(email)) {
			throw new EntityExistsException("Same Email is already enter with this user");
		}else if(customer.getMobileNo().equals(mobileNo)) {
			throw new EntityExistsException("Same Mobile no is updated with this user");
		}
		
		else if(persistcus.getEmail().equals(email)) {
			
			throw new EntityExistsException("Customer with this Email Already Exists By diffrent User");
		}else if(persistcus.getMobileNo().equals(mobileNo)) {
			throw new EntityExistsException("Customer with this Mobile number Already Exists By diffrent User");
		}
		}
		else {
			if(email.isBlank()) {
				customer.setEmail(customer.getEmail());
			}else 
				customer.setEmail(email);
			if(mobileNo.isBlank()) {
				customer.setMobileNo(customer.getMobileNo());
			}
			else
				customer.setMobileNo(mobileNo);
	this.customerRepo.save(customer);
		}
			
	}
	}
	
	public Customer getCustomer(String userName) {
		
		Customer customer = null;
		Optional<Customer> optCust= this.customerRepo.findById(userName);
		if(optCust.isPresent()) {
			  customer = optCust.get();
			 
		}
		return customer;
		
	}

}
