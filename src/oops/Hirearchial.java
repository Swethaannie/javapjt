package oops;
class Animal1
{
	public void Animalfood()
	{
		System.out.println("Animal food");
	}
	}
class Tiger extends Animal1
{
	public void Colour()
	{
		System.out.println("golden");
	}
}
class Cat extends Animal1
{
	public void Tail()
	{
		System.out.println("Thick");
	}
}

public class Hirearchial {
	public static void main(String[] args) {
	
	Tiger ob = new Tiger();
	ob.Animalfood();
     ob.Colour();
     Cat o = new  Cat();
     o.Animalfood();
     o.Tail();
}
}
