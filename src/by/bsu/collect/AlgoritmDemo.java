package by.bsu.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlgoritmDemo {
	public static void main(String[] args) {
		Comparator<Integer> comp = new Comparator<Integer>() {
			@Override
			public int compare(Integer n, Integer m) {
				return m.intValue() - n.intValue();
			}
		};
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 3, 4, 5);
		Collections.shuffle(list);
		print(list);
		Collections.sort(list, comp);
		print(list);
		Collections.reverse(list);
		print(list);
		Collections.rotate(list, 3);
		print(list);
		System.out.println("min: " + Collections.min(list, comp));
		System.out.println("max: " + Collections.max(list, comp));
		
		List<Integer> singl = Collections.singletonList(71);
		print(singl);
		// singl.add(21); //ошибка времени выполнения
	}
	
	private static void print(List<Integer> i) {
		for (int k : i) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
