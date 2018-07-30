
public class Demo2
{

	public static void main(String[] args)
	{
		System.out.println("MAIN CALLED BY "+Thread.currentThread().getName());
		Thread t1=new Thread()
		{
			public void run()
			{
				System.out.println("Run called by "+Thread.currentThread().getName());
			}
		};
		t1.start();
		
	}
}
