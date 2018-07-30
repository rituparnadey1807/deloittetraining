package Project;

import java.util.Scanner;

public class Temperature 
{
double temperature;
	public Temperature(double temperature)
	{
		this.temperature=temperature;
	}
public double conversion (double temp)
{
	double celsius=5*(temp-32)/9;
	return celsius;
	
}
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter 1 for celsius and 2 for farenheit");
	
	
	int choice=scanner.nextInt();
	
	switch(choice)
	{
	case 1:
		System.out.println("enter the temperature");
		double t=scanner.nextDouble();
		if((t>60)||(t<-10))
		{
		System.out.println("The temperature is beyond intolerable range");
		}
		else
		{
			System.out.println(" The temperature is fine");
		}
		break;
	case 2:
		System.out.println("enter the temperature");
		double t1=scanner.nextDouble();
		Temperature ob=new Temperature(t1);
		double k=ob.conversion(t1);
		System.out.println("Temperature in celsius is"+k);
		if((k>60)||(k<-10))
		{
			System.out.println("The temperature is beyond intolerable range");
		}
			else
			{
				System.out.println("The temperature is fine");
			}
		
		break;
		default:
			System.out.println("invalid choice. User should enter either 1 or 2");
		
	}
	
	
	
}
}
