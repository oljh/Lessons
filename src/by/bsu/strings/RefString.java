package by.bsu.strings;

public class RefString {
	public static void changeStr(String s) {
		s = s.concat(" Certified"); //creating new line
		//or s.concat(" Certified");
		//or s += " Certified"
	}
	public static void main (String[] args) {
		String str = new String("Java");
		changeStr(str);
		System.out.println(str);
	}

}
