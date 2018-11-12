package by.bsu.collection;

import java.util.Comparator;

public class Item2 {
	private int itemId;
	private float price;
	private String name;
	public Item2(int itemId,float price,String name) {
		super();
		this.itemId = itemId;
		this.price = price;
		this.name = name;
	}
	public int getItemId() {
		return itemId;
	}
	public float getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	
	public static class IdComparator implements Comparator<Item>{
		@Override
		public int compare(Item one, Item two) {
			return one.getItemId() - two.getItemId();
		}
	}
	
	public static class PriceComparator implements Comparator<Item>{
		@Override
		public int compare(Item one, Item two) {
			return Double.compare(two.getPrice(), one.getPrice());
		}
	}
}
