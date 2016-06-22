package menu;



public class AvilableMenu {

	public AvilableMenu(int itemId, String itemName, double itemPrice, String status) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.status = status;
	}


	private int itemId;
	private String itemName;
	private double itemPrice;
	private String time;
	private String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public AvilableMenu(int itemId, String itemName, double itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public AvilableMenu(int itemId, String itemName, double itemPrice, String time,String status ) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.time = time;
		this.status=status;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public AvilableMenu(){
		
	}
 
	public AvilableMenu(int itemId) {
		super();
		this.itemId = itemId;
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


	
	
}
