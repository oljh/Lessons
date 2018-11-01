package by.bsu.collection;

public class Item {
	private int itemId;
	private float price;
	private String name;

	public Item(int itemId, float price, String name) {
		this.itemId = itemId;
		this.price = price;
		this.name = name;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [itemId =" + itemId + "price = " + price + "" + "name = " + name + "]\n";
	}

}
