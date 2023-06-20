package pkg;

public class countofdigits {
	public static void main(String[] args) {
		int i=12345,count=0;
		
	while(i>0)
	{    
		i=i/10;
		count++;	
	}
	System.out.println(+count);
}
}

