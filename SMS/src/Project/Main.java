package Project;

abstract class Vehicle
{
	int price;
	public Vehicle()
	{
		System.out.println("VEHICLE CONS CALLED");
	}
	public abstract void start();
	public abstract void stop();
	public void music()
	{
		System.out.println("Music");
	}
}
class Car extends Vehicle
{

	@Override
	public void start() {
		price=80000;
		System.out.println("Car started");
		
	}

	@Override
	public void stop() {
		price=90000;
		System.out.println("Car stopped");
		
	}
	
	
	
}

public class Main
{
	public static void main(String args[])
	{
		Vehicle vehicle=new Car();
		vehicle.start();
		vehicle.stop();
		vehicle.music(); 
		
	}
}




























public class Main {

}
