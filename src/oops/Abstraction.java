package oops;
abstract class Car
{
abstract public void speedlimit();
public void carcolour()
{
	System.out.println("Blue");
	}
}
class Maruti extends Car
{
	public void speedlimit()
	{
		System.out.println("Maruti speedlimit");	
	}
	}
class BMW extends Car
{
	public void speedlimit()
	{
		System.out.println(" BMW speedlimit");	
	}
	}
public class Abstraction {

	
	public static void main(String[] args) {
		 Maruti m= new Maruti();
		 m.carcolour();
		 m.speedlimit();
		 

		 
	}

}
