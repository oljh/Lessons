package Tests;

public class DemoVarargs {
	public static int defineArgCount(Integer... args) {
		if (args.length == 0) {
			System.out.println("No arg");
		} else {
			for (int i : args) {
				System.out.printf("args:%d", i);
			}
		}
		return args.length;
	}

	public static void main(String[] args) {
		System.out.println("N= " + defineArgCount(7, 71, 555));
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("N= " + defineArgCount(arr));
		System.out.println(defineArgCount());
	}
}
