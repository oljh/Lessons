
package Tests;

public class MessangeRunner {

	public static void main(String[] args) {
		//�������������� ����� Integer
		Message<Integer> ob1 = new Message<Integer>();
		ob1.setValue(1);
		int v1 = ob1.getValue();
		System.out.println(v1);
		//�������������� ����� String
		Message<String> ob2 = new Message<String>("JAVA");
		String v2 = ob2.getValue();
		System.out.println(v2);
		
	//�������������� �� ��������� Object
		Message ob3 = new Message();
		ob3 = ob1;
		System.out.println(ob3.getValue());
		ob3.setValue(new Byte((byte)1));
		ob3.setValue("Java SE 8");
		System.out.println(ob3); /* ���������� ��� �������, � �� ��� ��������������*/
		ob3.setValue(71);
		System.out.println(ob3);
		ob3.setValue(null);
	} 
}
