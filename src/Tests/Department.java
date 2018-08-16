package Tests;

public class Department {
	{
		System.out.println("logic 1 id=" + this.id);
	}
	static {
		System.out.println("static logic 2");
	}

	private int id = 7;

	public Department(int id) {
		this.id = id;
		System.out.println("конструктор id = " + id);
	}

	public int getId() {
		return id;
	}

	{
		/* плохое расположение блока */
		System.out.println("logic 4");
	}
	
}




