package Exersices;

public class z3 
{

	public static void main(String[] args) 
	{
		P2("Programminge");
	}
	public static void P2(String s)
	{
		if(s.length()%2==0)
		{
			System.out.println(s.substring((s.length()/2)-1,(s.length()/2)+1));
		}
		else
		{
			System.out.println("Строка нечётной длины!");
		}
		
	}
}
