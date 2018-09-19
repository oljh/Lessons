package by.bsu.serial;

import java.io.Serializable;

public class Student implements Serializable{
	protected static String faculty;
	private String name;
	private int id;
	private transient String password;
	private static final long serialVersionUID = 1L;
	/* смысл поля serialVersionUID для класса будет объяснен ниже*/
		public Student (String nameOfFaculty, String name, String password) {
			faculty = nameOfFaculty;
			this.name = name;
			this.id = id;
			this.password = password;
		}
		public String toString() {
			return "\nfaculty"+faculty +"\nName" + name + "\nID"+ id + "\npassword" + password;
		}
}
