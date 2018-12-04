package by.bsu.threads;

public class ExceptionThreadDemo {
	public static void main(String [] args) {
	new ExceptThread().start();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("end of main");
	}
}
