package pkg;

public class swapping {
	public static void main(String[] args) {
		 int a=20,b=10,temp; 
		 System.out.println("Before swapping value is a="+a + "b ="+b);
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.println("After swapping value is a="+a + "b ="+b);
		 
		 //or
		 System.out.println("Before swapping value is a="+a + "b ="+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After swapping value is a="+a + "b ="+b);
	}
}
