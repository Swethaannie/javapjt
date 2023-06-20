package oops;
class Animal
{
	public void Animalfood()
	{
		System.out.println("Animal food");
	}
	}

class Dog extends Animal
{
 public void Dogbreed()

{
	System.out.println("Lab");
}
}
class Babydog extends Dog
{
	public void Babyfeature()
	{
		System.out.println("Babyfeature");
	}
}
public class Singlelevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		          Dog ob = new Dog();
		          ob.Dogbreed();
		          Babydog o = new Babydog();
                  o.Babyfeature();
	}
}

