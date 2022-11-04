package project02;

public class GoDTO {
	private int num;
	private String name;
	private int price;
	private String kind;
	
	public GoDTO() {
		
	}

	public GoDTO(String name, int price, String kind) {
		super();
		this.name = name;
		this.price = price;
		this.kind = kind;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	

}
