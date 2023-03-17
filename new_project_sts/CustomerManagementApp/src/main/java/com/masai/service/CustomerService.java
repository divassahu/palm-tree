package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Customer;
import com.masai.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public List<Customer> getAllCustomer(){
		List<Customer> custList=customerRepo.findAll();
		return custList;
	}
	
	public Optional<Customer> getCustomerById(Integer id) {
		Optional<Customer> cust=customerRepo.findById(id);
		return cust;
	}
	
	public Customer saveCustomer(Customer customer) {
		Customer c=customerRepo.save(customer);
		return c;
	}
	
	public void deleteCustomer(Integer id) {
		customerRepo.deleteById(id);
	}
}
