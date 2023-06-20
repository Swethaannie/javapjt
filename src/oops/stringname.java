package oops;

import java.util.Scanner;

public class stringname {
		public static void main(String[] args) {
			int[] ar=new int[3];
			int sr=0;
			float rr;
			
			Scanner sc=new Scanner(System.in);
			//ar[0]=23;
			//ar[1]=32;
			//ar[2]=22;
			//System.out.println(ar[0]);
			
			System.out.println("Enter the numbers");
			for(int i=0;i<3;i++)
			{
				ar[i]=sc.nextInt();
			}
			System.out.println("The numbers are");
			for(int i=0;i<3;i++)
			{
				System.out.println(ar[i]);
			}
			
			for(int v:ar)
			{
				sr=sr+v;
				
			}
			System.out.println("Sum is"+sr);
			rr=sr/3;
			System.out.println("Avg is"+rr);
		}

	}
