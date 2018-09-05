package by.bsu.io;

import java.io.File;
import java.util.Date;

public class FileTest {
	public static void main(String [] args) {
		// с объектом  типа File ассоциируется  файл на диске FileTest2.java
		File fp = new File("FileTest2.java");
		if (fp.exists()) {
			System.out.println(fp.getName() + "существует");
			if(fp.isFile()) {
				 System.out.println("Путь к файлу" + fp.getPath());
				 System.out.println("Абсолютный путь" + fp.getAbsolutePath());
				 System.out.println("Размер файла" + fp.length());
				 System.out.println("Последняя модификация :\t" + new Date(fp.lastModified()));
			}
		}
	}
	
}
