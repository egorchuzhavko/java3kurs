package lr6;

public class Person 
{
	private String name;
	private String surname;
	private int age;
	
	public Person(String name, String surname, int age)
	{
		this.name=name;
		this.surname=surname;
		this.age=age;
	}
	
	@Override
	public String toString()
	{
		String i="Имя: "+name+"\nФамилия: "+surname+"\nВозраст: "+age;
		return i;
	}
}
