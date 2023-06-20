package Arrayy;

public class Stringoperators {
	public static void main(String argv[])
	{
String s="hello";
String s1="Welcome";
String s2="Hello How are you";
//concatenation
System.out.println(s.concat(s1));
	
System.out.println(s+s1);
System.out.println(1+2+s+4+5);

//equals
System.out.println(s.equals(s1));
System.out.println(s.equals(s2));
System.out.println(s.equalsIgnoreCase(s2));

//CONTAINS
System.out.println(s2.contains("How"));

//toupper&lower
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());

//trim
System.out.println(s1.trim());//space at starting n ending will be removed.
//length
System.out.println(s.length());
//startswith
System.out.println(s2.startsWith("Hello"));
//endswith
System.out.println(s2.endsWith("you"));
//substring
System.out.println(s2.substring(2,7));
//charAt
System.out.println(s.charAt(1));
//split
String[]sr=s2.split(" ");
for(String v:sr)
{
	System.out.println(v);
	}
	}
}