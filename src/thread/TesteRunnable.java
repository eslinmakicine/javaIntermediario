package thread;

public class TesteRunnable {
	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		Thread t1 = new Thread(thread1);
		t1.start();
	}

}
