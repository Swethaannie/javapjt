package oops;

import java.util.Scanner;

public class Scannerpgm {
		public static void main(String[] args) {
			System.out.println("Enter the no");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c;
			c=a+b;
			System.out.print("sum is "+c);
		}
	}


