package Sons;

public class Cassir extends Products
{
	public int cassNumber;
	public String cassirName;
	
	public Cassir() {}
	
	public Cassir(int productId, String name, double cost, int cassNumber,String cassirName)
	{
		super (productId,name,cost);
		this.cassNumber=cassNumber;
		this.cassirName=cassirName;
	}
	
	public int getCassNumber() 
	{
		return cassNumber;
	}
	public void setCassNumber(int val) 
	{
		this.cassNumber=val;	
	}
	
	public String getCassirName() 
	{
		return cassirName;
	}
	public void setCassirName(String val1) 
	{
		this.cassirName=val1;
	}
	
	public String GetInfo()
	{
		return super.GetInfo()+ " Имя кассира: "+ cassirName + " Номер кассы: "+ cassNumber;
	}
}
