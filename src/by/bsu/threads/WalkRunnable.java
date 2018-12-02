package by.bsu.threads;

public class WalkRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Walking");
			try {
				Thread.sleep(7); // остановка в миллисекундах
			}catch (InterruptedException e) {
				System.out.print(e);
			}
		}
	}
}
