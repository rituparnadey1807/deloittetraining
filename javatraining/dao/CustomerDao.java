package com.deloitte.javatraining.dao;

import java.util.List;

import com.deloitte.javatraining.entity.Customer;

public interface CustomerDao {
	public String insertCustomerDetails(Customer customer);
	public Customer findByCustomerId(int customerId);
	public boolean isCustomerExists(int customerId);
	public boolean deleteCustomer(int customerId);
	public Customer updateCustomer(int customerId, Customer customer);
	public List<Customer> listAllEmployees();


}
