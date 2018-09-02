package by.bsu.polimorph;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class StoneAction {
	public void buildHouse(Stone stone) {
		try {
			stone.build("some data");
			// предусмотрена обработка ParseException и его подклассов
		}catch (ParseException e) {
			System.err.println(e);
		}
	}
}
