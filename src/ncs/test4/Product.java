package ncs.test4;

public class Product {

	String name;
	int price;
	int quantity;

	public Product() {

	}

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	private void information() {
		System.out.printf("상품명 : %s\n 가격 : %d 원\n 수량 : %d 개\n 총 구매 가격 : %d 원",
				name, price, quantity);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
