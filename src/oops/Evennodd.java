package oops;

import java.util.Scanner;

public class Evennodd {
	public static void main(String[] args) {
		int[] ar=new int[10];
	
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i=0;i<6;i++)
		{
			ar[i]=sc.nextInt();
		}
	
		for(int i=0;i<6;i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println("Even no's are:" +ar[i]);
			}
			
			else if(ar[i]%2!=0)
				
			{
				System.out.println("odd no's are:" +ar[i]);	
			}
		}
}
}