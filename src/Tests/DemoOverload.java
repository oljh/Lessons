package Tests;

public class DemoOverload {
	public static void printArgCount(Object... args) {
		System.out.println("Object args:" + args.length);
	}

	public static void printArgCount(Integer[]... args) {
		System.out.println("Integer args:" + args.length);
	}

	public static void printArgCount(int... args) {
		System.out.println("int args: "+args.length);
	}
	
	public static void main(String[] args) {
		Integer[] i = {1,2,3,4,5,6,7,8,9};
		printArgCount(7,"No",true,null);
		printArgCount(i,i,i,i,i,i,i);
		printArgCount(i,4,i);
		printArgCount(i,4,i);
	}
}
