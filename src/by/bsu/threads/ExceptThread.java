package by.bsu.threads;

public class ExceptThread extends Thread {
	public void run() {
		boolean flag = true;
		if (flag) {
			throw new RuntimeException();
		}
		System.out.println("end of Exception");
	}
}
