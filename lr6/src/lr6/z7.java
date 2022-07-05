package lr6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class z7 
{

	public static void main(String[] args) 
	{
		P7("Versions: Java 5, Java 6, Java 7, Java 8, Java 12.");
	}
	public static void P7(String s)
	{
		Pattern p=Pattern.compile("\\bJava\\s\\d+\\b");
		Matcher m=p.matcher(s);
		while (m.find())
		{
			System.out.println(s.substring(m.start(), m.end()));
		}
	}
}
