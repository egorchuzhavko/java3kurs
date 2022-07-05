package Sons;

public class Eggs extends Products
{
	public int amount;
	
	public Eggs() {}
	
	public Eggs(int productId, String name, double cost, int amount)
	{
		super (productId,name,cost);
		this.amount=amount;
	}
	
	public int getAmount() 
	{
		return amount;
	}
	public void setAmount(int val) 
	{
		this.amount=val;	
	}
	
	public String GetInfo()
	{
		return super.GetInfo()+ ", количество €иц: "+amount;
	}
}
