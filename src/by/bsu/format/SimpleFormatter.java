package by.bsu.format;

import java.util.Formatter;

public class SimpleFormatter {
	public static void main(String [] args) {
		Formatter f = new Formatter();
		//форматирование текста по объекту
		f.format("This %s is about %n%S %c","book", "java", '8');
		System.out.print(f);
	}
}
