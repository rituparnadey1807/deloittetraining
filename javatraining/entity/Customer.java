package com.deloitte.javatraining.entity;
import java.io.Serializable;

public class Customer implements  Serializable
{


private int customerID;
private String customerName;
private String customerAddress;
private int billAmount;

public Customer()
{
	
}

public Customer(int customerID, String customerName, String customerAddress, int billAmount) {
	super();
	this.customerID = customerID;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.billAmount = billAmount;
}

/**
 * @return the customerID
 */
public int getCustomerID() {
	return customerID;
}

/**
 * @param customerID the customerID to set
 */
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}

/**
 * @return the customerName
 */
public String getCustomerName() {
	return customerName;
}

/**
 * @param customerName the customerName to set
 */
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

/**
 * @return the customerAddress
 */
public String getCustomerAddress() {
	return customerAddress;
}

/**
 * @param customerAddress the customerAddress to set
 */
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}

/**
 * @return the billAmount
 */
public int getBillAmount() {
	return billAmount;
}

/**
 * @param billAmount the billAmount to set
 */
public void setBillAmount(int billAmount) {
	this.billAmount = billAmount;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */

@Override
public String toString() {
	return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerAddress="
			+ customerAddress + ", billAmount=" + billAmount + "]";
}

/*
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + billAmount;
	result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
	result = prime * result + customerID;
	result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
	return result;
}

/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (billAmount != other.billAmount)
		return false;
	if (customerAddress == null) {
		if (other.customerAddress != null)
			return false;
	} else if (!customerAddress.equals(other.customerAddress))
		return false;
	if (customerID != other.customerID)
		return false;
	if (customerName == null) {
		if (other.customerName != null)
			return false;
	} else if (!customerName.equals(other.customerName))
		return false;
	return true;
}

}
