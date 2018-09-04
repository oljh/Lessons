package by.bsu.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriterRunner {
	public static void main(String[] args) {
		String pArray[] = { "2018", "Java SE 8" };
		File fbyte = new File("data\\byte.data");
		File fsymb = new File("data\\symbol.txt");
		FileOutputStream fos = null;
		FileWriter fw = null;
		try {
			fos = new FileOutputStream(fbyte);
			fw = new FileWriter(fsymb);
			for (String a : pArray) {
				fos.write(a.getBytes());
				fw.write(a);
			}
		} catch (IOException e) {
			System.err.print("������ ������" + e);
		} finally {

			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				System.err.println("������ �������� ������ 1" +e);
			}
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
			System.err.println("������ �������� ������ 2" +e);
			}

		}
	}
}
