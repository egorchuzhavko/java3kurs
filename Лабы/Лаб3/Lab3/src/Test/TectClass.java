package Test;

public class TectClass {

	public static void main(String[] args) 
	{
		//1
//		int[] weights={1,2,3};
//		int[] values={1,2,10};
//		RandomFromArray ph=new RandomFromArray(weights,values);
//		for(int i=0;i<10;i++)
//		{
//			int r=ph.getRandom();
//			System.out.print(r+" ");
//		}
		
		//2
		Tree ph1=new Tree("Сосна",15,"Шишки",7.45);
		ph1.Show();
		ph1.Vid();
		ph1.Month();
		ph1.Rare();
		Tree ph2=new Tree("Берёза",7,"Сок",4.40);
		ph2.Show();
		ph2.Vid();
		ph2.Month();
		ph2.Rare();
		Tree ph3=new Tree("Яблоня",4,"Яблоки",5.05);
		ph3.Show();
		ph3.Vid();
		ph3.Month();
		ph3.Rare();
	}

}
