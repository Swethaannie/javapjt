package oops;

public class stringspilt {
	public static void main(String argv[])
	{
		String s1="seleninum web driver is used for webapplication testing";
		String sr[]=s1.split(" ");
		for(String v:sr)
		{
			System.out.println(v);
			if(v.contains("webapplication"))
					{
				break;
				}
					}
			}
}