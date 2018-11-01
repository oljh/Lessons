package by.bsu.collection;

public class Order {
	private int orderId;
	private float amount;
	//���� � ������ �������� ������������ ������
	public Order(int orderId, float  amount) {
		this.orderId = orderId;
		this.amount = amount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Order [orderId = "+ orderId+ ", amount = "+	amount +"] ";
	}
}
