package javaBasics;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Enter the string");
	Scanner sc = new Scanner(System.in);
	String str=sc.next();
	/*String rev="";
	
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
		
	}
	*/
	
	//Using StringBuffer
	
	StringBuffer sb= new StringBuffer(str);
	StringBuffer rev=sb.reverse();
	
	
	System.out.println("After reversing the string is :"	+	rev);
	
	
	
	}

}
