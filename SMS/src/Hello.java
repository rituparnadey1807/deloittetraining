import Project.Abc;
import Project.Example;

public class Hello {
	
	public void display()
	{
		How how=new How();
		how.hi();
		
		System.out.println("Display");
	}
	public void accept()
	{
		//display();
		System.out.println("Accept called");
		Hello o=new Hello();
		o.display();
	}

	public static void main(String[] args) 
	{
		Hello ob=new Hello();
		
	System.out.println("Welcome again");
	
	ob.accept();

	}

}
  class How
 {
	 public void hi() 
	 {
		 Employee emp=new Employee();
		 emp.getDetails();
		 System.out.println("Hi belongs to How class");
	 }
	 public static void main(String[] args) 
		{
			How ob1=new How();
			
		System.out.println("main");
		//Abc abc=new Abc();
		//abc.display();
		
		ob1.hi();
		

		}
 }