package lr9;

public class Z2 {

	public static void main(String[] args) throws InterruptedException  {
		Object obj=new Object();
		SomeClass sc1 = new SomeClass(obj);
		SomeClass sc2 = new SomeClass(obj);
		sc1.start();
		sc2.start();
		Thread.sleep(1000);
		sc1.stop();
		sc2.stop();
	}

}
