package javaBasics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		long Num = sc.nextLong();
		long Org_Num=Num;
		long rev=0;
		
		while(Num!=0)
		{
			
			rev=rev*10+Num%10;
			Num=Num/10;
						
		}
		
		if(rev==Org_Num)
		{
			
			System.out.println("Number is Palindrome");
			
		}
		
		else 
				
		{
			System.out.println("Number is not a Palindrome");
				
		}
		
		
	}

}
