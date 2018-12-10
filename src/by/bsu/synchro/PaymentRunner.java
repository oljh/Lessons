package by.bsu.synchro;

public class PaymentRunner {
	public static void main(String [] args) throws InterruptedException {
		final Payment payment = new Payment();
		new Thread() {
			public void run() {
				payment.doPayment(); //����� synchronized ������
			}
		}.start();
		Thread.sleep(200);
		synchronized (payment) {
			System.out.println("Init amount:");
			payment.initAmount();
			payment.notify();// ����������� � �������� ����������
		}
		synchronized (payment) {
			payment.wait(1_000);
			System.out.println("ok");
		}
	}
}
