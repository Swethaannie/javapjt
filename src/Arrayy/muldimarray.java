package Arrayy;
import java.util.Scanner;
public class muldimarray {
	public static void main(String argv[])
	{
		int arr[][]=new int[3][2];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<2;j++)
		{
			arr[i][j]=sc.nextInt();
		}
		}
		System.out.println("Entered elements are:");
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<2;j++)
		{
			System.out.print(arr[i][j]+"");
		}
		System.out.println();
		}
		
	}

}
