package oops;
interface  BasicAnimal
{
	public void eat();
	public void sleep();
	
}
class Monkey
{
	
	public void jump()
	{
		System.out.println("5 sec ");
	}
	public void bite()
	{
		System.out.println(" Bite ");
	}
	
}
class Human extends Monkey implements BasicAnimal
{
	public void eat()
	{
		System.out.println("Yummy  cooked food");
	}
	public void sleep()
	{
		System.out.println("ssleep 8 hours ");
	}
	public void speak()
	{
		System.out.println(" audible ");
	}
}
public class InheritanceMonkey {
	public static void main(String[] args) {
    Human  ob= new Human();
    ob.eat();
    ob.sleep();
    ob.jump();
    ob.bite();
    ob.speak();
    
}
}