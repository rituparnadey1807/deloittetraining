class Print
{
	public synchronized static void printSomething(String firstName, String lastName) {
		System.out.println("Welcome "+firstName);
		System.out.println("Bye "+lastName);
	}
}
public class Demo4 extends Thread
{
	private String firstName;
	private String lastName;
	
	public Demo4(int i,String firstName,String lastName)
	{
		super(i+"");
		this.firstName=firstName;
		this.lastName=lastName;
		start();
		
		//start();
	}
	public void run()
	{
		Print.printSomething(firstName,lastName);
	}
	public static void main(String[] args) {
		
			new Demo4(1,"Rahul","Mehta");
			new Demo4(1,"Riya","Mishra");
			//new Demo4(2);
			//new Demo4(3);
		
	}

}
