package Tests;

public class Message<T> {
	private T value;

	public Message() {
	}

	public Message(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public String toString() {
		if (value == null) {
			return null;
		} else {

			return value.getClass().getName() + " :" + value;
		}
}
	
	
	

}


