package oops;

import java.util.Scanner;

interface  Bankk
{
	public void ShowDetails();
	public void balance();
	public void Withdraw();
	public void Deposit();
	}
class Details implements Bankk
{
	int bal =43000;
	Scanner sc= new Scanner(System.in);
	public void ShowDetails()
	{
		
		System.out.println("Enter the Bank  Name:");
		String s1= sc.next();
		System.out.println("Enter the Customer  Name:");
		String s= sc.next();
		System.out.println("Enter the account  Number:");
		long a= sc.nextLong();
		System.out.println("Bank Name:" +s1);
		System.out.println("Customer name :" +s);
		System.out.println("Acc no :" +a);
		
		
	}
	public void balance()
	{ 
	
		System.out.println("Balance is:" +bal );
	}
	public void Withdraw()
	{
		
		System.out.println("Enter the amount to be withdrawn in figures:");
		int b= sc.nextInt();
		bal= bal-b;
		System.out.println("Available Balance is:" +bal );
		System.out.println("Enter the pin:");
		int c= sc.nextInt();
		System.out.println("Confirm the pin:");
		int d= sc.nextInt();
		if(c==d)
		{
			System.out.println("Successfull");	
		}
		else
		{
			System.out.println("Renter the pin");	
		}
	}
	public void Deposit()
	{
		
		System.out.println("Available Balance is:" +bal );
		System.out.println("Enter the amount to be deposited in figures:");
		int b= sc.nextInt();	
		bal= bal+b;
		System.out.println("New Balance is:" +bal );
	}
	
	
}

public class BankApp {
	public static void main(String[] args) {
		Details d = new Details();
		
		d.ShowDetails();
		d.balance();
		d.Withdraw();
		d.Deposit();
	}

}
