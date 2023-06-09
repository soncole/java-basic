package sec2;

public class Food {
	private String name;
	private int quantity;
	private int price;
	
	//생성자 함수
	public Food(){}
	public Food(String name){
		this.name = name;
	}
	public Food(String name, int quantity){
		this.name = name;
		this.quantity = quantity;
	}
	public Food(String name, int quantity, int price){
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
}
