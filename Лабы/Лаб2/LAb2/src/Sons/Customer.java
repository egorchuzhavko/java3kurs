package Sons;

public class Customer extends Products
{
	boolean shopCard;
	public String customerName;
	
	public Customer() {}
	
	public Customer(int productId, String name, double cost, boolean shopCard ,String customerName)
	{
		super (productId,name,cost);
		this.shopCard=shopCard;
		this.customerName=customerName;
	}
	
	public boolean getShopCard() 
	{
		return shopCard;
	}
	public void setShopCard(boolean val) 
	{
		this.shopCard=val;	
	}
	public String GetInfo()
	{
		return super.GetInfo()+ " ��� ����������: "+ customerName + "������� ����� ��������, 1-����, 0-���: "+ shopCard;
	}
}
