package by.bsu.synchro;

public class BufferThread {
	static int counter = 0;
	static StringBuilder s= new StringBuilder();

	public static void main(String args[]) throws InterruptedException {
		new Thread() {
			public void run() {
				synchronized (s) {
					while (BufferThread.counter++ < 3) {
						try {

							s.append("A");
							System.out.print(">" + counter + " ");
							System.out.println(s);
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}.start();
		Thread.sleep(100);
		while (BufferThread.counter++ < 6) {
			System.out.print("<" + counter + "");
			// в этом месте поток Main будет ждать освобождения блокировки объекта s
			s.append("B");
			System.out.println(s);

		}
	}
}
