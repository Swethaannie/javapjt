package oops;

public class Excepprunjava {
	public static void main(String[] args) {
		try {
	int a=20,b=0;
	int c= a/b;
	System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());	
		}
		try {
			int []a =new int[2];
			 a[0]=1;
			 a[1]=33;
			 
			System.out.println(a[3]);
				}
				catch(Exception e)
				{
					System.out.println("Array index out of bound expectation");	
				}
		
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("NULL exception");
		}
}
}