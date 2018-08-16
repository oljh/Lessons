package Tests;

public class Exam<T extends Number> {
	private String name;
	private T mark;
	public Exam(T mark, String name) {
		this.name = name;
		this.mark = mark;
	}
	
	public T getMark() {
		return mark;
	}
	
	private int roundMark() {
		return Math.round(mark.floatValue()); //метод класса Number
	}
	
	public boolean equalsToMark(Exam<?> ob) {
		
		return roundMark() == ob.roundMark();
	}
	
}
