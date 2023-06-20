package oops;

import java.util.Scanner;

public class amstrong {
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
		s=s+(r*r*r);
		a=a/10;
		
		}
		if(s==temp)
		{
			System.out.println(" no is Amstrong");
			
		}
		else
		{
			System.out.println(" no is not Amstrong");
		}
	}
}
