package oops;

import java.util.Scanner;

public class reversepgm {
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int s=0;
		int r;
		while(a>0)
		{
		r=a%10;
		s=s*10+r;
		a=a/10;
		
		}
		System.out.println("Reverse is" +s);
}
}
