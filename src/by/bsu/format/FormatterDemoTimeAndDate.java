package by.bsu.format;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemoTimeAndDate {
	public static void main(String[] args) {
		Formatter f = new Formatter();
		Calendar  cal = Calendar.getInstance();
		
		//вывод в 12 часовом формате
		f.format("%tr",cal);
		System.out.println(f);
		
	}
}
