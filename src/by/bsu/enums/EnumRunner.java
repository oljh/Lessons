package by.bsu.enums;

public class EnumRunner {
	public static void main(String [] args) {
		int i = 4;
		for (Shape f : Shape.values()) {
			f.setShape(3, i--);
			System.out.println(f + " Площадь=" + f.computeSquare());
		}
	}
}
