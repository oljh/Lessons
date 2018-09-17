package by.bsu.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
	public static void main (String [] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("data\\res.txt"));
		String tmp = "";
		while ((tmp = br.readLine())!=null) {
			//пробел в качестве разделителя
			String[] s = tmp.split("\\s");
			//вывод полученных строк
			for (String res : s) {
				System.out.println(res);
			}
		}
		}	catch (IOException e) {
			e.printStackTrace();
		}finally{
			if (br !=null) {
				try {
					br.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
