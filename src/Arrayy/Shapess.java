package Arrayy;

public class Shapess {
	public static void main(String[] args) {
		Shapess ob=new Shapess();
		double r=ob.trianglee();
		System.out.println("Area of triangle is"+ r);
		ob.rectanglee();
		ob.circlee();
		ob.square(2);
			
	}
		public double trianglee()
		{
		double l=5,b=6;
		double ar=0.5*l*b;
		return ar;
		
		}
		public void rectanglee()
		{
		int l=4,b=5;
		int ar= l*b;
		System.out.println("area of rectangleis " +ar);
		}
		public void circlee()
		{
		double r=5.2;
		double  ar=3.14*r*r;
		System.out.println("area of circle is" +ar);
		}
		public void square(int a)
		{

		int ar=a*a;
		System.out.println("area of square is "+ar);
		}
		
		
}
