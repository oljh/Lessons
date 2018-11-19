package by.bsu.set;

import java.util.EnumSet;

public class UseEnumSet {
	public static void main(String[] args) {
		/*
		 * ��������� japanAuto �������� �������� ���� enum �� ���������, �������������
		 * ���������
		 */
		EnumSet<CarManufacturer> japanAuto = EnumSet.range(CarManufacturer.TOYOTA, CarManufacturer.SUZUKI);
		EnumSet<CarManufacturer> other = EnumSet.complementOf(japanAuto);
		System.out.println(japanAuto);
		System.out.println(other);
		action("audi", japanAuto);
	}

	public static boolean action(String auto, EnumSet<CarManufacturer> set) {
		CarManufacturer cm = CarManufacturer.valueOf(auto.toUpperCase());
		boolean ok = false;
		if (ok = set.contains(cm)) {
			// ���������
		} else {
			System.out.println("���������:" + cm);
		}
		return ok;
	}
}
