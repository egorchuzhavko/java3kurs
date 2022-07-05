package petsclasses;

import com.domain.IPet;

public abstract class Animal implements IPet
{
	public String name;
	
	public Animal()
	{
		
	}
	public Animal (String name)
	{
		this.name=name;
	}
	
	public abstract String getName();
	public abstract void setName(String name);
	public abstract void play();
}
