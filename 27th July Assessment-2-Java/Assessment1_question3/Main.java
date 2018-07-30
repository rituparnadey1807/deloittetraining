package com.javatraining.deloitte.Assessment2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner
		sc = new Scanner(System.in);

		
		
		int l=sc.nextInt();
		
		int[] a = new int[l];
		
		
		for(int i=0;i<l;++i)
		a[i]=sc.nextInt();
		if(UserMainCode.checkTripplets(a))
		System.out.println("TRUE");
		else
		System.out.println("FALSE");
		sc.close();

}
}