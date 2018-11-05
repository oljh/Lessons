package by.bsu.Iterator;

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

	public List<Item> getListItem(){
	
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
