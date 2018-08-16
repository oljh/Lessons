package by.bsu.nested;

public class RunnerShip {
	public static void main(String args) {
		//вызов статического метода
		Ship.LifeBoat.down();
		//создание объекта статического метода
		Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
		lifeBoat.swim();
	}
}
