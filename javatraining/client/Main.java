package com.deloitte.javatraining.client;

import com.deloitte.javatraining.dao.CustomerDao;
import com.deloitte.javatraining.daoimpl.CustomerDaoimpl;
import com.deloitte.javatraining.entity.Customer;

public class Main 
{
	public static void  main(String args[]) 
	{
		Customer customer=new Customer(1,"Neha","Pune",12000);
		
		CustomerDao customerDao=new CustomerDaoimpl();
		String result=customerDao.insertCustomerDetails(customer);
		System.out.println(result);
	}
}
