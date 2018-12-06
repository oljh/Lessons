package by.bsu.synch;

import java.io.IOException;

public class SynchroRun {
	public static void main(String[] args) {
		Resource s = null;
		try {
			s = new Resource("data\\result.txt");
			SyncThread t1 = new SyncThread("First", s);
			SyncThread t2 = new SyncThread("Second", s);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		} catch (IOException e) {

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
	}
}
