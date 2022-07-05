package lr10;

public class Program {

	public static void main(String[] args) throws InterruptedException {
        Philosopher[] philosophers = new Philosopher[5];
        Object[] vilka = new Object[5];

        for (int i = 0; i < 5; i++) {
            vilka[i] = new Object();
        }
        for (int i = 0; i < 5; i++) {
            Object leftFork = vilka[i];
            Object rightFork = vilka[(i + 1) % 5];
            if (i == 4) {
                philosophers[i] = new Philosopher(rightFork, leftFork, "Философ " + (i + 1));
            }
            else {
                philosophers[i] = new Philosopher(leftFork, rightFork, "Философ " + (i + 1));
            }
            Thread t = new Thread(philosophers[i]);
            t.start();
            Thread.sleep(1000);
    }
}
}
