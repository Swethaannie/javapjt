package oops;
interface Tvremote
{
    public void samsung();
	}
interface SmartTvremote
{
	public void colour();
    public void specification();
    public void bandwidth();
	}
class Tv implements  SmartTvremote
{
	public void colour()
	{
		System.out.println("BLACK");
	}
	
    public void specification()
    {
		System.out.println("Battery");
	}
    public void bandwidth()
    {
    	System.out.println("5hz");
    }
}

public class Tvinheritance {
	public static void main(String[] args) {
		Tv ob = new Tv();
		ob.colour();
		ob.specification();
		ob.bandwidth();

}
}
