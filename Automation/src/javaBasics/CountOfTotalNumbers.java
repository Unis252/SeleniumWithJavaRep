package javaBasics;

import java.util.Scanner;

public class CountOfTotalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter any number");
		long Num = sc.nextLong();
		int count=0;
		
		while(Num>0)
		{
			long Org=Num%10;
			
			count++;
			
			Num=Num/10;
		}
		
		System.out.println("Number of digits in the given number is"+count);
		
		
	}

}
