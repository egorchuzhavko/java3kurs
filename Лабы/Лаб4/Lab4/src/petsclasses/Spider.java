package petsclasses;
import com.domain.IPet;

public class Spider extends Animal implements IPet 
{
	public int weight;
	public boolean poison;
	
	public Spider (String name, int weight, boolean poison)
	{
		super(name);
		this.weight=weight;
		this.poison=poison;
	}
	
	public Spider() 
	{
		
	}
	
	public void Info()
	{
		String s="Нет";
		if(poison==true)
		{
			s="Да";
		}
		System.out.println("Вес: "+weight+"Ядовит: "+s);
	}
	
	public void eat()
	{
		System.out.println("Eating....\n");
	}
	public void walk()
	{
		System.out.println("Walking....\n");
	}
	public String speak(String words)
	{
		String phrase=words+"..shh.shh...\n";
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
		System.out.println("Паук плетёт паутину.");
	}
}
