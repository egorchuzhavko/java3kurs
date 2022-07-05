package Exersices;

public class Z2 
{

	public static void main(String[] args) 
	{
		P("Object-oriented programming is a programming language model organized around objects rather than 'actions' and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.");
	}
	public static void P(String s)
	{
		s=s.toLowerCase();
		String r="object-oriented programming";
		System.out.println(s.replaceAll(r, "OOP"));
	}

}
