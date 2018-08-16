package Tests.inner.study;

public abstract class AbstractTeacher {
	private int id;
	public AbstractTeacher(int id) {
		this.id = id;
	}
	
	/*methods*/
	
	public abstract boolean excludeStudent(String name);
	
}
