package oops;

import java.util.Scanner;

public class stringarray {
	public static void main(String[] args) {
		String[] sr=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the names");
		for(int i=0;i<5;i++)
		{
			sr[i]=sc.nextLine();
		}
		System.out.println("The names are");
		for(int i=0;i<5;i++)
		{
			System.out.println(sr[i]);
		}
		
	}
		
}
