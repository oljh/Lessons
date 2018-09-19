package by.bsu.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializator {
	public boolean serialization(Student s, String fileName) {
		boolean flag = false;
		File f = new File(fileName);
		ObjectOutputStream ostream = null;
		try {
			FileOutputStream fos = new FileOutputStream(f);
			if (fos != null) {
				ostream = new ObjectOutputStream(fos);
				ostream.writeObject(s);// сериализация
				flag = true;
			}
		} catch (FileNotFoundException e) {
			System.err.println("Файл не может быть создан:" + e);
		} catch (IOException e) {
			System.err.println("" + e);
		} finally {
			try {
				if (ostream != null) {
					ostream.close();
				}
			} catch (IOException e) {
				System.err.println("ошибка закрытия потока");
			}
		}
		return flag;
	}

	public Student deserialization(String fileName) throws InvalidObjectException {
		File fr = new File(fileName);
		ObjectInputStream istream = null;
		try {
			FileInputStream fis = new FileInputStream(fr);
			istream = new ObjectInputStream(fis);
			// десериализация
			Student st = (Student) istream.readObject();
			return st;
		} catch (ClassNotFoundException ce) {

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
