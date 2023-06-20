package pkg;

public class workbook {
	public static void main(String[] args) {
		System.out.println(23==43);
		int a=55,b=70,d=17;
		System.out.println((a<50)&&(a<b));
		//to print second digit
		System.out.println(d%10);
		if((a>b)&&(a>d))
		{
			System.out.println("A is greater");
		}
		else if((b>d)&&(b>a))
		{
			System.out.println("B is greater");
		}
		else if((d>a)&&(d>b))
		{
			System.out.println("D is greater");
		}
		//Even or odd
		if(a%2==0)
		{
			System.out.println("A is even");
		}
		else 
		{
			System.out.println("A is Odd");
		}
	}
}
