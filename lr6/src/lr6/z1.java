package lr6;

public class z1 
{

	public static void main(String[] args) 
	{
		String a="I like Java!";
		System.out.println(a.charAt(a.length()-1));
		System.out.println(a.endsWith("!!!"));
		System.out.println(a.startsWith("I like"));
		System.out.println(a.contains("Java"));
		System.out.println(a.indexOf("Java"));
		System.out.println(a.replace("a","o"));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.substring(7,11));
		
		StringBuilder s=new StringBuilder();
		s.append("I like c#");
		s.append("\n2+2=4");
		System.out.println(s.replace(s.length()-2, s.length()-1, "равно"));
		
		
	}
}
