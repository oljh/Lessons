package by.bsu.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>(3) {
			{
				this.put("�����", 3);
				this.put("������", 5);
				this.put("������", 1);
				this.put("����", 1);
			}
		};
		System.out.println(hm);
		hm.put("������", 4); // ������ ��� ���������� ��� ���������� �����
		System.out.println(hm + " ����� ������ ��������");
		Integer a = hm.get("����");
		System.out.println(a + "  ������ �� ����� '����'");
		// ����� ���-������� � ������� ������� ���������� Map.Entry<K,V>
		Set<Map.Entry<String, Integer>> setv = hm.entrySet();
		System.out.println(setv);
		Iterator<Map.Entry<String, Integer>> i = setv.iterator();
		while (i.hasNext()) {
			Map.Entry<String, Integer> me = i.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		Set<Integer> val = new HashSet<Integer>(hm.values());
		System.out.println(val);
	}
}