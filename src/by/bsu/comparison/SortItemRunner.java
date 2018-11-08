package by.bsu.comparison;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import by.bsu.collection.Item;

public class SortItemRunner {
	 public static void main(String [] args) {
		 ArrayList<Item> p = new ArrayList<Item>() {
			 {
				 add(new Item(52201, 9.75f, "T-Shirt"));
				 add(new Item(52127, 13.9f, "Dress"));
				 add(new Item(47063,45.95f, "Jeans"));
				 add(new Item(55431, 60.9f, "Gloves"));
				 add(new Item(53205, 31f, "Shirt"));
				 add(new Item(52201, 14.5f, "Tie"));
			 }
		 };
		 
		 //�������� �����������
		 Comparator<Item> comp = new Comparator<Item>() {

			@Override
			public int compare(Item one, Item two) {
				return Double.compare(two.getPrice(),one.getPrice());
			}
			//public boolean equals(Object ob) {/*����������*/}
		 };
		 //���������� ������ ��������
		 Collections.sort(p,comp);
		 System.out.println(p);
	 }
}
