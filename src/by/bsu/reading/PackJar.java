package by.bsu.reading;

import java.io.File;
import java.io.FileNotFoundException;

public class PackJar {
	private String jarFileName;
	public final int BUFFER = 2_048;
	public PackJar(String dirName) throws FileNotFoundException {
		//получение списка имен файлов в директории
		File dir = new File(dirName);
		if (!dir.exists() || !dir.isDirectory()) {
			
		}
	};
}
