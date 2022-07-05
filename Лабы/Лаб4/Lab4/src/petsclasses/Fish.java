package petsclasses;

import com.domain.IPet;

public class Fish extends Animal implements IPet
{
	public int weight;
	public String pattern;
	
	public Fish (String name, int weight, String pattern)
	{
		super(name);
		this.weight=weight;
		this.pattern=pattern;
	}
	
	public Fish() 
	{
		
	}

	public void eat()
	{
		System.out.println("Eating....\n");
	}
	public void swim()
	{
		System.out.println("Swimming....\n");
	}
	public String speak(String words)
	{
		String phrase=words+"..bul-bul...\n";
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
		this.name=name;
	}
	@Override
	public void play()
	{
		System.out.println("Рыбка просто плавает.");
	}
}
