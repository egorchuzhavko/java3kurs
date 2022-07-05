package lr6;

public class z4 
{

	public static void main(String[] args) 
	{
		q("Чужавко Егор",1,"КПиЯП");
	}
	public static void q(String surname, int mark, String subject)
	{
		System.out.println(String.format("Студент %15s получил %3s по предмету %10s.",surname,mark,subject));
	}
}
