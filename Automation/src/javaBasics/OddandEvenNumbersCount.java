package javaBasics;

import java.util.Scanner;

public class OddandEvenNumbersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		long Num = sc.nextLong();
		int Even_count=0;
		int Odd_count=0;
		
		
		while(Num>0)
		{
			long rem=Num%10;
			
			if(rem%2==0)
			{
				
				Even_count++;
				
			}
			
			else
			{
				
				Odd_count++;
			}
			
			Num=Num/10;
		}
		System.out.println("Number of even numbers is " +Even_count);
		System.out.println("Number of Odd numbers is " +Odd_count);	
	
	}

}
