package by.bsu.packing;

public class UnpackDemo {
	public static void main(String[] args) {
		//расположение и имя архива
		String nameJar = "example.jar";
		//куда файлы будут распакованы
		String destinationPath = "c:\\temp\\";
		new UnPackJar().unpack(destinationPath, nameJar);
		} 
}
