
public class Demo1 extends Thread
{
Thread t;
public Demo1()
{
	t=new Thread(this);//this represents in which current class will run
	t.start();//thread is born and looks for run function
	System.out.println("t1 started: "+Thread.currentThread().getName());//executed by main
	
}
public void run()
{
	System.out.println("Run called: "+Thread.currentThread().getName());
}
public static void main(String[] args)
{
	Demo1 d=new Demo1();
	System.out.println("Hello I am main: "+Thread.currentThread().getName());//main thread always given priority
}
}