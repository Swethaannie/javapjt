package oops;

import java.util.Scanner;

public class posnegcount {
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc= new Scanner(System.in);
		int[] ar=new int[7];
		int pos=0,neg=0,zeros=0;
        for(int i=0;i<7;i++)
        {
        	ar[i]=sc.nextInt();	
        }
        for(int i=0;i<7;i++)
        {
        if(ar[i]>0)
        {
        	pos++;
        }
        else if(ar[i]<0)
        {
        	neg++;
        }
        else if(ar[i]==0)
        {
        	zeros++;
        }
        }
        System.out.println("Number of positive integers are:" +pos);
        System.out.println("Number of negative integers are:" +neg);
        System.out.println("Number of  zeros are:" +zeros);
        }
}
