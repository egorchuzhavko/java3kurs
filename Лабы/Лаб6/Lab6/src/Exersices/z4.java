package Exersices;

public class z4 
{

	public static void main(String[] args) 
	{
		P3("Парфянович Александр",10,"ТРПО");
	}
	public static void P3(String surname, int mark, String subject)
	{
		//System.out.println(String.format("Студент %.15s получил %.3s по предмету %.10s.",surname,mark,subject));
		System.out.println(String.format("Студент %15s получил %3s по предмету %10s.",surname,mark,subject));
	}
}
