package Project;

import java.util.Scanner;

public interface PhysicalConstants {
	double speed_vaccum=299792458;
	double gconstant=6.67428* Math.pow(10,-11);
	double accln=9.80665;

}
class Physics implements PhysicalConstants
{
	public void energy(double mass)
	{
		double en=mass* speed_vaccum* speed_vaccum;
		System.out.println(en);
	}
	public void force(double m1,double m2,double radius)
	{
		double f=gconstant*(m1-m2)/radius;
		System.out.println(f);
    }
	public void distance(double time)
	{
		double d=0.5*time*gconstant;
		System.out.println(d);
    }
	public static void main(String args[])
	{
		Physics phy=new Physics();
		Scanner scanner=new Scanner(System.in);
		//
		System.out.println("Enter 1 to calculate energy, 2 for force, 3 for distance");
		int ch=scanner.nextInt();
		switch(ch)
		{
		case 1:
			phy.energy(51.6);
			break;
		case 2:
			phy.force(51.6,89.7,9);
			break;
		case 3: 
			phy.distance(12);
			break;
			default:
				System.out.println("Invalid choice.Enter 1,2 or 3");
		}
			scanner.close();
		}
	
}
