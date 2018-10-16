package by.bsu.packing;

import java.io.FileNotFoundException;

public class PackDemo {
	public static void main() {
		String dirName = "путь к дерриктории";
		PackJar pj = new PackJar("example.jar");
		try {
			pj.pack(dirName);
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}

	}
}
