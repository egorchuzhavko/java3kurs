package Sons;

public class Products 
{
	public int productId;
	public String name;
	public double cost;
	
	public Products() {}
	public Products(int productId, String name, double cost)
	{
		this.productId=productId;
		this.name=name;
		this.cost=cost;
	}
	
	public int getProductId() 
	{
		return productId;
	}
	public void setProductId(int val) 
	{
		this.productId=val;	
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String val1) 
	{
		this.name=val1;
	}
	
	public double getCost() 
	{
		return cost;
	}
	public void setCost(double val2) 
	{
		this.cost=val2;
	}
	public String GetInfo() {
		return "Номер товара: "+productId+" , наименование: "+name+", цена: "+cost;
	}
	
}
