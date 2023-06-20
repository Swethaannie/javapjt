package oops;
import java.util.Scanner;
public class avgpgm {
public static void main(String args[])
{
	int[] ar =new int[10];
	int s=0;
	double avgg;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers");
	for(int i=0;i<10;i++)
	{
		ar[i]=sc.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		s=s+ar[i];
	}
	avgg=(s/10);
	System.out.println("Average is" +avgg);
}
}
