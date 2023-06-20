package oops;

import java.util.Scanner;

public class fibanociseries {
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=0,b=1;
		int c=0;
		System.out.print(+a );
		System.out.print("\t"+b);
		for(int i=1;i<n;i++)
		{
		c=a+b;
		a=b;
		b=c;
		
		System.out.print("\t" +c);
		}
		
}
}