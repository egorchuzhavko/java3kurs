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
		if(name=="�����" | name=="���" | name=="����")
		{
			System.out.println("��� �������");
		}
		else if(name=="�����������" | name=="�����" | name=="������")
		{
			System.out.println("��� ����������������");
		}
		else
		{
			System.out.println("������ ���");
		}
	}
	public void Month()
	{
		int m=age*12;
		System.out.println("������ "+m+ " �������");
	}
	public void Rare()
	{
		if(name=="�����������" | name=="�������� ������" | name=="������� ������")
		{
			System.out.println("������ ������.");
		}
		else
		{
			System.out.println("���������������� ������.");
		}
	}
	public void Show()
	{
		System.out.print("������������: "+name+"\n�������: "+age+"\n�����: "+fruit+"\n������: ");
	}

}
