package oops;
class Member
{
String name;
int age;
long  phoneno;
String address;
int salary;
public void Printdetails()
{
	System.out.println("Name is" +name );
	System.out.println("age is" +age );
	System.out.println("phoneno is" +phoneno );
	System.out.println("address is" +address);
	System.out.println("salary is" +salary );
	
}
}
class Employee extends Member
{
	String specilization;
	}
class Manager extends Member
{
	String Department;
	}

public class Inheritancepgm {
	public static void main(String[] args) {

		Employee e = new Employee();
		e.name="Swetha";
		e.age= 26;
		e.phoneno= 9400977017l;
		e.address= "Arapuzhikkara";
		e.salary=30000;
		e.Printdetails();
		System.out.println( e.specilization = "Java");
		Manager m1 = new Manager();
		m1.name="Sneha";
		m1.age= 27;
		m1.phoneno= 9400977045l;
		m1.address= "Scotland";
		m1.salary=40000;
		m1.Printdetails();
		System.out.println(m1.Department ="H.R");
		
}
}