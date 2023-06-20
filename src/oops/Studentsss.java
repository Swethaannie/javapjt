package oops;

public class Studentsss {
	int studentid;
	String  studentname;
	String college="coet";

public Studentsss(int studentid,String studentname)
{
 this.studentid =studentid;
 this.studentname =studentname;
}
public void display()
{
System.out.println("studentid"+studentid);
System.out.println("studentname"+studentname);
}
public static void main(String[] args) {
	Studentsss s= new Studentsss(101,"swetha");
	s.display();
}
}