package by.bsu.yield;

public class YieldRunner {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println("Старт потока 1");
				Thread.yield();
				System.out.println("Завершение потока 1");
			}
		}.start(); // старт потока
		new Thread() {
			public void run() {
				System.out.println("Старт потока 2");
				System.out.println("Завершение потока 2");
			}
		}.start();
	}
}
