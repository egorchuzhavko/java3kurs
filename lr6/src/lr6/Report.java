package lr6;

public class Report 
{
	public static void ShowSal(Employee[] ass)
	{
		for(int i=0;i<ass.length;i++)
		{
			System.out.println(String.format("Сотрудник %s: %.2f",ass[i].fullname,ass[i].salary));
		}
	}
}
