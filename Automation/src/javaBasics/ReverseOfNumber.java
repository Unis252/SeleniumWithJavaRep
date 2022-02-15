package javaBasics;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		System.out.println("Before reversing number is"+num);
		
		//Using algorith
		/*int num=sc.nextInt();
		System.out.println("Before reversing number is"+num);
		int rev=0;
		
		while(num!=0)
		{
			
			rev=rev*10+num%10;
			num=num/10;
			
		} */

		//Using StrigBuffer
		
		/*StringBuffer sb= new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();*/
		
		//Using String Builder
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev= sb1.reverse();
		
		System.out.println("Reversed number is "+rev);
		
	}

}
