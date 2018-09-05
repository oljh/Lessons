package by.bsu.io;

import java.io.File;
import java.util.Date;

public class FileTest {
	public static void main(String [] args) {
		// � ��������  ���� File �������������  ���� �� ����� FileTest2.java
		File fp = new File("FileTest2.java");
		if (fp.exists()) {
			System.out.println(fp.getName() + "����������");
			if(fp.isFile()) {
				 System.out.println("���� � �����" + fp.getPath());
				 System.out.println("���������� ����" + fp.getAbsolutePath());
				 System.out.println("������ �����" + fp.length());
				 System.out.println("��������� ����������� :\t" + new Date(fp.lastModified()));
			}
		}
	}
	
}
