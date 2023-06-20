package oops;

import java.util.Scanner;

public class primejava {
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int f=0;
		for(int i=2;i<a/2;i++)
		{
		if((a%i)==0)
		{
			f=0;
		}
		else
		{
			f=1;
		}
		}
		if(f==0)
		
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println(" prime");	
		}
		}
}
