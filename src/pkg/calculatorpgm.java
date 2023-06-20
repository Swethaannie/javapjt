package pkg;

public class calculatorpgm {
	public static void main(String[] args) {
		int a=4,b=3,result,value=2;
   switch(value)
   {
   case 1:result=a+b;
          System.out.println("Added value is"+result);
         break;
   case 2:result=a-b;
         System.out.println("Difference is "+result);
         break;
   case 3:result=a/b;
          System.out.println("Divided  value is"+result);
         break;
   case 4:result=a*b;
          System.out.println("Multiplied  value is"+result);
          break;
   default:System.out.println("Invalid choice");

}
}
}