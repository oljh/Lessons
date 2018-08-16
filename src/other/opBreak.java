package other;

public class opBreak {

	// ссылка на внешнюю точку

	public void breaks() {
		int j = 3;
		OUT: while (true) {
			for (;;) {
				if (j == 10) {
					break OUT;
				} else {
					j++;
					System.out.printf("%d", j);

				}
			}
		}
	}

	public void mass() {
			int arRef[], ar;
			float[] arRefFloat, arFloat;
			int arDyn[] = new int[10];
			String str[] = new String[7];
			int arInt[] = {5,4,3,2,4,5,6,3};
			int arIntI[] = new int[] {32,3,34,4,6,6,3,2,234,566};
			byte arByte[] = {1,4,3,4};
			Object arObj = new float[5];
			arRef = arDyn;
			arDyn = arInt;
			arRefFloat = (float[])arObj;
			arObj = arByte;
			arRefFloat = (float[])arObj;
			//arInt = arByte;
			//arInt = (int[])arByte;
			}	

	
}
