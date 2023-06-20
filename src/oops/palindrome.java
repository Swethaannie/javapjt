package oops;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int temp;
		int s=0;
		int r;
		temp=a;
		while(a>0)
		{
		r=a%10;
		s=s*10+r;
		a=a/10;
		
		}
		if(s==temp)
		{
			System.out.println(" no is palindrome");
			
		}
		else
		{
			System.out.println(" no is not palindrome");
		}
		}
}
