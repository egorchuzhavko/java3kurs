package Sons;

public class Milk extends Products
{
	public double freshDayOff;
	
	public Milk() {}
	
	public Milk(int productId, String name, double cost, double freshDayOff)
	{
		super (productId,name,cost);
		this.freshDayOff=freshDayOff;
	}
	
	public double getFreshDayOff() 
	{
		return freshDayOff;
	}
	public void setFreshDayOff(double val) 
	{
		this.freshDayOff=val;	
	}
	
	public String GetInfo()
	{
		return super.GetInfo()+ ", срок годности: "+freshDayOff;
	}
}
