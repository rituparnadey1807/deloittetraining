package Project;

public class Demo {

	int num1=10,num2=20;
	public Demo(int num1,int num2)
	
	{
		this.num1=num2;
		num2=num1;
	}
	public void changeValues(int num1,Demo demo)
	{
		
		
	}
	public static void main(String args[])

{
	Demo d=new Demo();
	int s=0;
	s+=d.add(1,2);
	s+=d.add(3,2);
	s+=d.add(1,9);
	System.out.println("Total sum is "+s
			
			);
}
}