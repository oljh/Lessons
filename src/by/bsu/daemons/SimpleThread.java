package by.bsu.daemons;

public class SimpleThread extends Thread {
	public void run() {
		try {
			if (isDaemon()) {
				System.out.println("����� ������ ������");
				Thread.sleep(10_000);
			} else {
				System.out.println("����� �������� ������");
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			if (!isDaemon()) {
				System.out.println("���������� �������� ������");
			} else {
				System.out.println("���������� ������ ������");
			}
		}
	}
}
