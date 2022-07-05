package petsclasses;

import com.domain.IPet;

public class Cat extends Animal implements IPet
{
	public int weight;
	public String color;
	
	public Cat (String name, int weight, String color)
	{
		super(name);
		this.weight=weight;
		this.color=color;
	}
	
	public Cat(String name) 
	{
		super(name);
	}

	public Cat() 
	{
		
	}

	public void eat()
	{
		System.out.println("Eating....\n");
	}
	public void sleep()
	{
		System.out.println("Sleeping zz-z-z-z-z....\n");
	}
	public String speak(String words)
	{
		String phrase=words+"..mauu...\n";
		return phrase;
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	@Override
	public void setName(String name)
	{
		this.name= name;
	}
	@Override
	public void play()
	{
		System.out.println(name+" любит играть с верёвочкой");
	}
	
	
}
