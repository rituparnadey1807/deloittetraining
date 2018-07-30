package com.deloitte.javatraining.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.deloitte.javatraining.dao.CustomerDao;
import com.deloitte.javatraining.dbcon.DBConnection;
import com.deloitte.javatraining.entity.Customer;

public class CustomerDaoimpl implements CustomerDao {
	//
	Connection connection = DBConnection.getConnection();
	int results;
	@Override
	public String insertCustomerDetails(Customer customer) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into customer values(?,?,?,?)");
			preparedStatement.setInt(1, customer.getCustomerID());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setString(3, customer.getCustomerAddress());
			preparedStatement.setInt(4, customer.getBillAmount());
			results = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(results == 0)
			return "insert failed";
		else
			return "insert successful";
		
	}

	@Override
	public Customer findByCustomerId(int customerId) {
		PreparedStatement preparedStatement;
		Customer customer = null;
		
		try {
			preparedStatement = connection.prepareStatement("select * from customer where customerId=?");
			preparedStatement.setInt(1, customerId);
			
			ResultSet data = preparedStatement.executeQuery();
			data.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		PreparedStatement preparedStatement;
		boolean recordExists=false;
		try {
			preparedStatement = connection.prepareStatement("select * from customer where customerId=?");
			preparedStatement.setInt(1, customerId);
			
			ResultSet data = preparedStatement.executeQuery();
			recordExists=data.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer updateCustomer(int customerId, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> listAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
}
