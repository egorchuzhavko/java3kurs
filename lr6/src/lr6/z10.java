package lr6;

public class z10 
{
	public static void main(String[] args) 
	{
		String s="���� ���� ������ �� ��, ������� � ����� 1 �� �������� �������. 123 324 111 4554";
		s=s.replace(",", "");
		s=s.replace(".", "");
		String[] mas=s.split(" ");
		for(int i=0;i<mas.length;i++)
		{
			if(q(mas[i]).compareTo(mas[i])==0)
			{
				System.out.println("����� "+mas[i]+" ���������!");
			}
		}
	}
	public static String q(String s)
	{
		if(s.length()<=1)
		{
			return "����� ������ ���� ��������.";
		}
		char[] s1 = s.toCharArray();
		String r = "";
		for (int i = s1.length - 1; i >= 0; i--) 
		{
			if(Character.isDigit(s1[i]))
			{
				r = r + s1[i];
			}
			else
			{
				return "����� �� ������� ������ �� ����.";
			}
		}
		return r;
	}
}
