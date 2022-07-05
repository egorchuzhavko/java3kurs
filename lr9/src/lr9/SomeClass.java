package lr9;

public class SomeClass extends Thread {
	private Object obj;
	
	public SomeClass(Object obj) {
		this.obj=obj;
	}
	
	@Override
	public void run() {
		int i = 0;
		while (i < 3) {
            synchronized (obj) {
                try {
                    System.out.println(getName());
                    obj.notify();
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
	}
}
