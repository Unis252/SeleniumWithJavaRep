package javaBasics;

import java.util.Scanner;

public class SwappingofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the two values");
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		
	
		
		System.out.println("Before swapping values are " +a+"	"+b);
		
		
		//Logic 1--With using third variable
		/*int c;
		c=a;
		a=b;
		b=c;*/
		
		
		//Logic 2--without using third variable
		
				a=a+b;
				b=a-b;
				a=a-b;
		
		//Logic 3-without using third variable
		
		
		/*a=a*b;
		b=a/b;
		a=a/b; */
		
		//Logic 
					
		
		System.out.println("After swapping values are "+a+"	" +b);
				
		

	}

}
