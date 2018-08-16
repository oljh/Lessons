package by.bsu.strings;

public class EgualsStringBuffer {
	public static void main(String [] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer(48);
		sb1.append("Java");
		sb.append("Java");
		System.out.println(sb1.equals(sb));
		System.out.println(sb.hashCode() == sb1.hashCode());
		System.out.println(sb.toString().contentEquals(sb1));
	}
}
