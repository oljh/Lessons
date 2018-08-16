package Tests;

public class CloneRunner {
	private static void mutation(Student p) {
		try {
			p = (Student)p.clone();
		}catch(CloneNotSupportedException e) {	
		}
		p.setID(1000);
		System.out.println("->id " + p.getId());
	}
	
	public static void main(String[] args) {
		Student ob = new Student();
		System.out.println("id = " + ob.getId());
		mutation(ob);
		System.out.println("id = " + ob.getId());
	}
}
