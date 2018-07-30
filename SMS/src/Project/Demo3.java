package Project;


	public class Demo3
	{
	String name;
	public void display()
	{
		
			try {
				System.out.println("I AM");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("The length is : "+name.length());
		
		//catch(ArrayIndexOutOfBoundsException e)-this will give an error since this is not the kind of exception that needs to be handled
		//catch(Exception e)
		
			
			
			System.out.println("Null encountered");
		
			System.out.println("method ends");		
	}
	 public static void main(String args[])
	 {
		 Demo3 ob=new Demo3();
		 System.out.println("Hello main");
		 ob.display();
	 }
	}

