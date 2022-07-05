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
        	consoleLog("������");
            synchronized (lf) {
            	consoleLog("���� ����� ����� � ����");
                synchronized (rf) {
                	consoleLog("���� ������ ����� � ����");
                	consoleLog("������");
                	consoleLog("������� ������ ����� �� ����");
                }
                consoleLog("������� ����� ����� �� ����.");
            	consoleLog("������ ������..");
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

