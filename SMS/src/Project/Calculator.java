package Project;

import java.util.Scanner;

public class Calculator
{
	public void add(int num1,int num2)
	{
		int sum=num1+num2;
		System.out.println(sum);

}
	public void add(double num1,double num2)
	{
		double sum=num1+num2;
		System.out.println(sum);

}
	public void add(int num1,double num2)
	{
		double sum=num1+num2;
		System.out.println(sum);

}
	public void add(double num1,int num2)
	{
		double sum=num1+num2;
		System.out.println(sum);

}
	public void diff(int num1,int num2)
	{
		
		int sum=num1-num2;
		System.out.println(sum);

}
	public void diff(double num1,double num2)
	{
		double sum=num1-num2;
		System.out.println(sum);

}
	public void diff(int num1,double num2)
	{
		double sum=num1-num2;
		System.out.println(sum);

}
	public void diff(double num1,int num2)
	{
		double sum=num1-num2;
		System.out.println(sum);

}
	public void mul(int num1,int num2)
	{
		
		int sum=num1*num2;
		System.out.println(sum);

}
	public void mul(double num1,double num2)
	{
		double sum=num1*num2;
		System.out.println(sum);

}
	public void mul(int num1,double num2)
	{
		double sum=num1*num2;
		System.out.println(sum);

}
	public void mul(double num1,int num2)
	{
		double sum=num1*num2;
		System.out.println(sum);

}
	public void div(int num1,int num2)
	{
		int result;
		if(num1>num2)
		result=num1/num2;
		else
			result=num1/num2;
		System.out.println(result);

}
	public void div(double num1,double num2)
	{
		double result;
		if(num1>num2)
		result=num1/num2;
		else
			result=num1/num2;
		System.out.println(result);
}
	public void div(int num1,double num2)
	{
		double result;
		if(num1>num2)
		result=num1/num2;
		else
			result=num1/num2;
		System.out.println(result);

}
	public void div(double num1,int num2)
	{
		double result;
		if(num1>num2)
		result=num1/num2;
		else
			result=num1/num2;
		System.out.println(result);

}
	public static void main(String args[])
	{
		int x1=0;double x2=0.0;
		Calculator calculator=new Calculator();
		Scanner sc=new Scanner(System.in);
		
		calculator.add(10,5.9);
		calculator.diff(10,5);
		calculator.mul(10,5);
		calculator.div(10,5);
	}
}