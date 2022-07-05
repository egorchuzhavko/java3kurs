package Test;

public class Tree 
{
	public String name;
	public int age;
	public String fruit;
	public double height;
	
	Tree(String _name,int _age,String _fruit,double _height)
	{
		name=_name;
		age=_age;
		fruit=_fruit;
		height=_height;
	}
	public void Vid()
	{
		if(name=="Сосна" | name=="Ель" | name=="Ёлка")
		{
			System.out.println("Вид Хвойные");
		}
		else if(name=="Лиственница" | name=="Берёза" | name=="Яблоня")
		{
			System.out.println("Вид Широколиственные");
		}
		else
		{
			System.out.println("Другой вид");
		}
	}
	public void Month()
	{
		int m=age*12;
		System.out.println("Дереву "+m+ " месяцев");
	}
	public void Rare()
	{
		if(name=="Лиственница" | name=="Железное дерево" | name=="Красное дерево")
		{
			System.out.println("Редкое дерево.");
		}
		else
		{
			System.out.println("Распространенное дерево.");
		}
	}
	public void Show()
	{
		System.out.print("Наименование: "+name+"\nВозраст: "+age+"\nПлоды: "+fruit+"\nВысота: ");
	}

}
