package oops;

import java.util.Scanner;

public class calculatorr {
	public static void main(String[] args) {
		int result;
		System.out.println("Enter the first no");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the second no");
		int b=sc.nextInt();
		System.out.println("Enter the choice:\n 1.addition \n 2.Subtraction \n 3.Divison \n 4.Multiplication");
		int choice=sc.nextInt();
		
		
   switch(choice)
   {
   case 1:result=a+b;
          System.out.println("Added value is"+result);
         break;
   case 2:result=a-b;
         System.out.println("Difference is "+result);
         break;
   case 3:
         if(b==0)
         {
        	 System.out.println("Error");
          }
         else
         {
        	 result=a/b;	 
        	 System.out.println("Divided  value is"+result);
         }
         
         break;
   case 4:result=a*b;
          System.out.println("Multiplied  value is"+result);
          break;
   default:System.out.println("Invalid choice");

}
}
}
