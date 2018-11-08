package by.bsu.collection;

import java.util.ArrayList;

public class Order2 extends ArrayList<Item>{
	private int orderId;
	// private float amount // по прежнему не нужен так как сумму можно вычислить
	public Order2(ArrayList<Item> c) {
		super(c);
	}
	public Order2(int orderId, ArrayList<? extends Item> c) {
		super(c);
		this.orderId = orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}	

}
