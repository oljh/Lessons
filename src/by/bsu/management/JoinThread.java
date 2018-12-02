package by.bsu.management;

public class JoinThread extends Thread{
	public JoinThread (String name) {
		super(name);
	}
	public void run() {
		String nameT = getName();
		long timeout = 0;
		System.out.println("����� ������" + nameT);
		try {
			switch(nameT) {
			case "First":
				timeout = 5_000;
			case "Second":
				timeout = 1_000;
			}
			Thread.sleep(timeout);
			System.out.println("���������� ������" + nameT);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
