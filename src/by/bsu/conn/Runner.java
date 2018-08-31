package by.bsu.conn;

public class Runner {
	public static void main(String [] args) {
		SameResource f = new SameResource();
		try {
			Connector.loadResource(f);
		}catch (IllegalArgumentException e) {
			System.err.print("обработка unchacked - исключение вне метода"+e);
		}
	}
}
