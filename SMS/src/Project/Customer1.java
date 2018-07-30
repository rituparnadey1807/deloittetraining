package Project;

public class Customer1 
{
int custId;
String customerName;
int billAmount;

public Customer1() 
{
	custId=100;
	customerName="NA";
	billAmount=200;
}



public Customer1(int custId, String customerName, int billAmount) {
	super();
	this.custId = custId;
	this.customerName = customerName;
	this.billAmount = billAmount;
}



public int getCustId() {
	return custId;
}


public void setCustId(int custId) {
	this.custId = custId;
}


public String getCustomerName() {
	return customerName;
}


public void setCustomerName(String customerName) {
	this.customerName = customerName;
}


public int getBillAmount() {
	return billAmount;
}


public void setBillAmount(int billAmount) {
	this.billAmount = billAmount;
}


public void display()
{
	System.out.println("Customer Id "+custId);
	System.out.println("Customer Name "+customerName);
	System.out.println("Customer bill "+billAmount);
}


}
