package oops;

import java.util.Scanner;

public class Sumofdigits {
	
	public static void main(String args[])
	{
		
		System.out.println("Enter the no");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Sumofdigits s=new Sumofdigits();
		
		int sum= s.sumofdigit(n);
		System.out.println("sum of integers" +sum);
	}
	
  public int sumofdigit(int n)
  {
	int c=0,r;
	while(n>0)
	{
	r=n%10;
	c=c+r;
	n=n/10;
	}
	return c;
	}
	
	
}
	

