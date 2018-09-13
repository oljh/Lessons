package by.bsu.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) {
		// � �������� ���� File ������������� ���� �� ����� FileTest2.java
		File fp = new File("FileTest2.java");
		if (fp.exists()) {
			System.out.println(fp.getName() + "����������");
			if (fp.isFile()) {
				System.out.println("���� � �����" + fp.getPath());
				System.out.println("���������� ����" + fp.getAbsolutePath());
				System.out.println("������ �����" + fp.length());
				System.out.println("��������� ����������� :\t" + new Date(fp.lastModified()));
				System.out.println("���� �������� ��� ������ :\t" + fp.canRead());
				System.out.println("���� �������� ��� ������ :\t" + fp.canWrite());
				System.out.println("���� ������:\t" + fp.delete());
			} else {
				System.out.println("���� " + fp.getName() + "�� ����������");
				try {
					if (fp.createNewFile()) {
						System.out.println("����" + fp.getName() + "������");

					}
				} catch (IOException e) {
					System.err.println("������" + e);
				}
				//� ������ ����  File ���������� �������\���������� 
				// � ����� ������� ������ ���� ������ ������� com.learn � ����������� �������
				File dir = new File("com"+File.separator + "learn");
				if (dir.exists() && dir.isDirectory()) {
					System.out.println("�������"+ dir.getName() + "����������");
				}
				File[] files = dir.listFiles();
				for(int i=0;i < files.length;i++) {
					Date date = new Date(files[i].lastModified());
					System.out.println("\n"+files[i].getPath() +"\t|" + files[i].length()+"\t|"+date);
					//������������ toLocaleString(); ��� toGMTString();
				}
			//����� listRoots() ���������� ��������� �������� ��������;
				File root = File.listRoots()[1];
				System.out.printf("\n%s %,d �� %,d ��������.", root.getPath(), root.getUsableSpace(), root.getTotalSpace());
			}
		}
	}

}
