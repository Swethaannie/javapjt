package pkg;

public class Operatorspgm {
	public static void main(String[] args) {
		//Airthmetic operators
    int a=20,b=10; 
    System.out.println("a+b="+(a+b));
    System.out.println("a-b="+(a-b)); 
    System.out.println("a*b="+(a*b));
    System.out.println("a/b="+(a/b));
    System.out.println("a%b="+(a%b));
    
    //Assignment operators
    int c=30,d=20;
    System.out.println("c=c+d "+(c+=d));
    System.out.println("c=c-d "+(c-=d));
    //Relational operators
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a==b);
    //logical operators
    String username ="abc";
    String pswd ="123";
    System.out.println(username=="abc"&& pswd=="123");
    System.out.println(username=="abc"|| pswd=="1234");
    System.out.println(!(username=="abc"));
    //Unary operator
    int d1=2;
    System.out.println(d1++);//2
    System.out.println(d1);//3
    System.out.println(++d1);
    System.out.println(d1--);
    
    
    
}
}