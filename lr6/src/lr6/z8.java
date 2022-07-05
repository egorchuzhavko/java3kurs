package lr6;

public class z8 
{
	public static void main(String[] args) 
	{
		String s="fffff ab f 1234 jkjk";
		String[] mas=s.split(" ");
		int min=q(mas[0]),ind=0;
		for(int i=1;i<mas.length-1;i++)
		{
			if(q(mas[i])<min)
			{
				min=q(mas[i]);
				ind=i;
			}
		}
		System.out.println(mas[ind]);
		
	}
	public static int q(String s)
	{
		int c=s.length(),k=0;
		char[] f=s.toCharArray();
		for(int i=1;i<f.length;i++)
		{
			if(f[k]==f[i])
			{
				c--;
				k=1;
			}
		}
		return c;
	}
}
