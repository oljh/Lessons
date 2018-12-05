package by.bsu.threads;

public class SimpleThread extends Thread{
		@Override
		public void run() {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
}
