package oops;

import java.util.Scanner;

public class stringcount {
	public static void main(String[] args)
	{
	int count=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.nextLine();
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
		{
			count++;
		}
	}
	System.out.println(count);
}
}


