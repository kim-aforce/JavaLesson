package JavaTest;

public class BookData {
	public String title, author;
	public int sales, price;
	
	public BookData(String title, String author, int sales, int price) {
		this.title = title;
		this.author = author;
		this.sales = sales;
		this.price = price;
	}
	public int getsales() {
		return sales;
	}
	public int getTotal() {
		return sales + price;
	}
	public double getCospa() {
		return (double) sales / getTotal();
	}
}