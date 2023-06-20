package oops;
interface Bank
{
	public void deposit();
    public void withdraw();
    public void balance();
	}
interface Creditcard
{
 public void creditcarddetails();
}

class SBI implements Bank,Creditcard
{
public void deposit()
{
 System.out.println("SBI deposit");
}
public void withdraw()
{
	System.out.println("SBI withdraw");
}
public void  balance()
{
	System.out.println("SBI  balance");
}
@Override
public void creditcarddetails() {
	// TODO Auto-generated method stub
	
}
}
class Federalbank implements Bank,Creditcard
{
public void deposit()
{
 System.out.println("Federalbank deposit");
}
public void withdraw()
{
	System.out.println("Federalbank withdraw");
}
public void  balance()
{
	System.out.println("Federalbank  balance");
}
public void creditcarddetails() {
	// TODO Auto-generated method stub
	
}
}

public class Interfacepgm {
	public static void main(String[] args) {
		Bank ob = new SBI();
		ob.deposit();
		ob.withdraw();
		ob.balance();
		ob = new Federalbank();
		ob.deposit();
		ob.withdraw();
		ob.balance();
		
	}

}
