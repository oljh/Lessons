package by.bsu.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
	public static void main(String [] args) {
		String file = "data\\file.txt";
		File f = new File(file);
		int b, count = 0;
		FileReader is = null; // ������ ��� ����� � ������ �� �����
		try {
			is = new FileReader(f);
			//is = newFileInputStream(f);
			while ((b = is.read())!= -1) {
				System.out.print((char)b);
			}
		System.out.println("\n ����� ����" + count);
		}catch (IOException e) {
			System.err.println("������ �����"+e);
		}finally {	
			try {
				if(is != null) {
					is.close();
				} 
				
			}catch (IOException e) {
				System.err.println("������ ��������: " + e);
			}
		}
		
	}
}
