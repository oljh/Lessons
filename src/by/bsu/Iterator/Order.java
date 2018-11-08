package by.bsu.Iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import by.bsu.collection.Item;

public class Order implements Iterable<Item>{
	private int orderId;
	private List<Item> listItems;
	//private float amount
	
	public Order(int order, List<Item> listItems) {
		this.orderId = orderId;
		this.listItems = listItems;
	}
	public int getOrderId() {
		return orderId;
	}

	public List<Item> getListItems(){
	return Collections.unmodifiableList(listItems);
	}
	
	//некоторые делегированные методы интерфейсов List и Collection
	
	public boolean add(Item e) {
		return listItems.add(e);
	}
	
	public Item get(int index) {
		return listItems.get(index);
	}
	
	public Item remove(int index) {
		return listItems.remove(index);
}
	@Override
	public Iterator<Item> iterator() {
		return listItems.iterator();
	}
	
}
