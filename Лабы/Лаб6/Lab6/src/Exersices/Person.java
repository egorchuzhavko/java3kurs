package Exersices;

public class Person 
{
	public String name;
	public String surname;
	public int age;
	
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
