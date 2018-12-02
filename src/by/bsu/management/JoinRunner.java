package by.bsu.management;

public class JoinRunner {
	static {
		System.out.println("����� ������ main");
	}
	public static void main(String[] args) {
		JoinThread jt1 = new JoinThread("First");
		JoinThread jt2 = new JoinThread("Second");
		jt1.start();
		jt2.start();
		try {
			jt1.join(); //����� main ���������� �� ��������� ������ ������ jt1
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()); // ��� �������� ������
	}
}
