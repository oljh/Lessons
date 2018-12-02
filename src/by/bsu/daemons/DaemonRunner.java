package by.bsu.daemons;

public class DaemonRunner {
	public static void main (String [] args) {
	SimpleThread st = new SimpleThread();
	SimpleThread daemon = new SimpleThread();
	daemon.setDaemon(true);
	daemon.start();
	st.start();
	System.out.println("Последний оператор main");
	}
	

}
