package pkg;

import java.util.Scanner;

public class TRY {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the choice:");
		Scanner sc =new Scanner(System.in);
		n= sc.nextInt();
		switch(n)
		{
		
		case 1: System.out.println("Happy");
		        break;
		case 2: System.out.println("Sad");
                 break;
		case 3: System.out.println("Angry");
                 break;
		case 4: System.out.println("Angry");
                 break;
		}
	}

}
