package lr10;

public class Philosopher implements Runnable {

    private Object lf, rf;
    private String name;

    public Philosopher(Object lf, Object rf, String name) {
        this.lf = lf;
        this.rf = rf;
        this.name=name;
    }

    @Override
    public void run() {
        try {
        	consoleLog("думает");
            synchronized (lf) {
            	consoleLog("взял левую вилку в руку");
                synchronized (rf) {
                	consoleLog("взял правую вилку в руку");
                	consoleLog("кушает");
                	consoleLog("положил правую вилку на стол");
                }
                consoleLog("положил левую вилку на стол.");
            	consoleLog("думает дальше..");
            }
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
    
    private void consoleLog(String action) throws InterruptedException {
        System.out.println(name + " " + action);
        Thread.sleep(1000);
    }
}

