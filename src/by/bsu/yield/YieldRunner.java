package by.bsu.yield;

public class YieldRunner {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println("����� ������ 1");
				Thread.yield();
				System.out.println("���������� ������ 1");
			}
		}.start(); // ����� ������
		new Thread() {
			public void run() {
				System.out.println("����� ������ 2");
				System.out.println("���������� ������ 2");
			}
		}.start();
	}
}
