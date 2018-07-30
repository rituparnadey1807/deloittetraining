package Project;

public class Demo2
{
String name;
public void display()
{
	try
	{
		System.out.println("I AM");
		System.out.println("The length is : "+name.length());
	}
	//catch(ArrayIndexOutOfBoundsException e)-this will give an error since this is not the kind of exception that needs to be handled
	catch(Exception e)
	{
		System.out.println("Null encountered");
	}
		System.out.println("method ends");		
}
 public static void main(String args[])
 {
	 Demo2 ob=new Demo2();
	 System.out.println("Hello main");
	 ob.display();
 }
}
