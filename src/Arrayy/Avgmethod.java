package Arrayy;

import java.util.Scanner;


public class Avgmethod {
	public static void main(String args[])
	{
		
		System.out.println("Enter the first  no");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter the second  no");
		int n2=sc.nextInt();
		System.out.println("Enter the third  no");
		int n3=sc.nextInt();
		Avgmethod a=new Avgmethod();
		int avgg= a.avgmethods(n1,n2,n3);
		System.out.println("avg of integers" +avgg);
	}
	public int avgmethods(int n1,int n2,int n3)
	  {
		int r;
		r=(n1+n2+n3)/3;
	    return r;
}
}
