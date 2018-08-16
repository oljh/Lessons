package by.bsu.nested;

public class Ship {
	private int id;

	// abstract, final, private, protected

	public static class LifeBoat {
		private int boatId;

		public static void down() {
			System.out.println("Шлюбки на воду!");

		}

		public void swim() {
			System.out.println("Отплытые шлюбки");
		}

	}
}
