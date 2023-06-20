package oops;

import java.util.Scanner;

public class palindromestring {
	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.nextLine();
	String m= "";
	for(int i=s.length()-1;i>=0;i--)
	{
		
		m=m+s.charAt(i);
		
}
	System.out.println("Reversed string is :"+m);
	if(s.equals(m))
	{
		System.out.println("PALINDROME");
	}
	else
	{
		System.out.println(" NOT PALINDROME");
	}
	}
	
	}
