package Tests;

public class Ship {
	private Engine eng;

	public class Engine {
		public void launch() {
			System.out.println("������ ���������!");
		}
		
		public final void init() {
			eng = new Engine();
			eng.launch();
		}
	}
}
