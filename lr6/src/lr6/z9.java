package lr6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class z9 
{

	public static void main(String[] args) 
	{
		String s="One two three раз dngdsngjdsng два три one1 two2 1230";
		String[] mas=s.split(" ");
		int k=0;
		for(int i=0;i<mas.length;i++)
		{
			if(q(mas[i]))
			{
				k++;
			}
		}
		System.out.println("Количество слов, содержащих только символы латинского алфавита: "+k);
	}
	public static boolean q(String s)
	{
		Pattern p=Pattern.compile("\\b[a-zA-Z]+\\b");
		Matcher m=p.matcher(s);
		return m.matches();
	}

}
