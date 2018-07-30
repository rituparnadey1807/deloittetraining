import java.io.*;

import Project.Customer1;
public class Demo6 
{
	public static void main(String[] args)throws IOException
	
	{
		Customer1 cust=new Customer1(123,"Anjali",34000);

		FileOutputStream stream=new FileOutputStream("customer.txt");
		BufferedOutputStream bs=new BufferedOutputStream(stream);
		ObjectOutputStream ot=new ObjectOutputStream(bs);
		ot.writeObject(cust);
		ot.close();System.out.println(cust.getCustomerName()+" your record saved");
		
}
}