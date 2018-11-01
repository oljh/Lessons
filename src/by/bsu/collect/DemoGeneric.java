package by.bsu.collect;

import java.util.ArrayList;

public class DemoGeneric {
	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<>();
		//ArrayList(int) b = ArrayList<>();
		list.add("Java"); /* компилятор "знает" допустимый тип передаваемого значения */
		list.add("JavaFX 2");
		String res = list.get(0);
		//list.add(new StringBuiler("C#"));
		System.out.println(list);
		
	}
}
