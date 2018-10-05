package by.bsu.reading;

import java.io.FileReader;
import java.util.Scanner;

public class ScanerDemo {
	public static void main(String [] args) {
		String filename = "text\\scan.txt";
		Scanner scan = null;
		try {
			FileReader fr = new FileReader(filename);
	scan = new Scanner(fr);
	//чтение из файла
	while (scan.hasNext()) {
		if(scan.hasNext())
	}
		}
	}
}
