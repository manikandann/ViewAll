package order;

public class Order {

	
	public Order(int itemId) {
		super();
		this.itemId = itemId;
	}
	private int itemId;
	private String itemName;
	private double itemPrice;
	private String itemstatus;
	public String getItemstatus() {
		return itemstatus;
	}
	public void setItemstatus(String itemstatus) {
		this.itemstatus = itemstatus;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
}
