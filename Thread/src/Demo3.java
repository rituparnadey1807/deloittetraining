
public class Demo3 extends Thread
{
	public Demo3(int i)
	{
		super(i+"");
		start();
	}
	public void run()
	{
		System.out.println("RUN CALLED BY :"+currentThread().getName());
	}
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
			new Demo3(i);
		
	}

}
