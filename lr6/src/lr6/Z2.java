package lr6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Z2 
{

	public static void main(String[] args) 
	{
		P("Object-oriented programming Object-oriented programming Object-oriented programming object-oriented programming");
	}
	public static void P(String s)
	{
		Pattern p=Pattern.compile("(^|\\b)Object-oriented programming($|\\b)",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(s);
		int k=1;
		StringBuffer s1=new StringBuffer();
		while (m.find())
		{
			if(k%2==0)
			{
				m.appendReplacement(s1, "OOP");
			}
			k++;
		}
		m.appendTail(s1);
		System.out.println(s1);
	}

}
