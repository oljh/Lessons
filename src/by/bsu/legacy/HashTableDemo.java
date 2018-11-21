package by.bsu.legacy;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, Double> ht = new Hashtable<Integer, Double>();
		for (int i = 0; i < 5; i++) {
			ht.put(i, Math.atan(i));
		}
		Enumeration<Integer> ek = ht.keys();
		int key;
		while (ek.hasMoreElements()) {
			key = ek.nextElement();
			System.out.println("");
		}
		System.out.println("");
		Enumeration<Double> ev = ht.elements();
		double value;
		while (ev.hasMoreElements()) {
			value = ev.nextElement();
			System.out.printf("%.2f", value);
		}
	}
}
