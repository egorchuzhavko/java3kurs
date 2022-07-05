package lr9;

public class Z1 {

	
	public static void main(String[] args) {
		SClass thread=new SClass();
        Z1.CheckState(thread.getState());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        Z1.CheckState(thread.getState());
	}
	
	
	public static void CheckState(Thread.State st) {
		if(st==Thread.State.NEW) {
			System.out.println("Состояние New");
		}
		if(st==Thread.State.RUNNABLE) {
			System.out.println("Состояние Runnable");
		}
		if(st==Thread.State.TERMINATED) {
			System.out.println("Состояние Terminated");
		}
	}
}
