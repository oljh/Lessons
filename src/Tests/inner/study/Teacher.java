package Tests.inner.study;

public class Teacher extends AbstractTeacher{
	public Teacher(int id) {
		super (id);
	}
	
	public boolean excludeStudent(String name) {
		return false;
	}
	
	
}
