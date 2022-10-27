
package ncs.test5;

public class Book {
	String title;
	String author;
	int Price;
	String publisher;
	double discountRate;

	public Book() {

	}

	public Book(String tilte, String author, int price, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.Price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return Price;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

}
