package by.bsu.format;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemoTimeAndDate {
	public static void main(String[] args) {
		Formatter f = new Formatter();
		Calendar  cal = Calendar.getInstance();
		
		//����� � 12 ������� �������
		f.format("%tr",cal);
		System.out.println(f);
		//�������������� ����� ������
		f = new Formatter();
		f.format("%tc", cal);
		System.out.println(f);
//		����� �������� ���� � ����
		f = new Formatter();
		f.format("%tL:%tM",cal,cal);
		System.out.println(f);
		//������������ ����� ������
		f = new Formatter();
		f.format("%tB %tb %tm",cal,cal,cal);
		System.out.println(f);
		
	}
}
