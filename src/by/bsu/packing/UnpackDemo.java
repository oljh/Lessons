package by.bsu.packing;

public class UnpackDemo {
	public static void main(String[] args) {
		//������������ � ��� ������
		String nameJar = "example.jar";
		//���� ����� ����� �����������
		String destinationPath = "c:\\temp\\";
		new UnPackJar().unpack(destinationPath, nameJar);
		} 
}
