package by.bsu.polimorph;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class StoneAction {
	public void buildHouse(Stone stone) {
		try {
			stone.build("some data");
			// ������������� ��������� ParseException � ��� ����������
		}catch (ParseException e) {
			System.err.println(e);
		}
	}
}
