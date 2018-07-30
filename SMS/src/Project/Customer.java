package Project;

public class Customer {
	
	int p=0;
	public void disp(int p,int n)
	{
		System.out.println("Adding two nos "+p+n);
	}
public void disp()
{
	System.out.println("no addition");
	
}
public void disp(int...num)
{
	//can accept anything even 0
	for (int i:num)
		System.out.println(i);
}
public static void main(String args[])
{
	Customer cust=new Customer();
	cust.disp(1,2);
}
}
