package 演習問題;
//問3.	Bookクラスを作成し、タイトル、著者、価格を引数に取るコンストラクターと、
//タイトルと著者のみを引数に取るコンストラクターを定義してください。
//価格が指定されない場合はデフォルト値を設定してください。

public class Book {
	String title, author;
	int BookPrice;
	
	public Book(int BookPrice) {
		this.title = "Holy Bible";
		this.author = "Jesus";
		this.BookPrice = BookPrice;
	}
	public void no1_book() {
		System.out.println("世界一の本は" + title +"です。");
		System.out.println("著者は" + author +"です。");
		System.out.println("その本の価格は" + BookPrice +"です。");
	}
	
	public static void main(String[] args) {
		Book book_no1 = new Book(0);		
		book_no1.BookPrice = 100000000;
		
		book_no1.no1_book();
		
		
	}
}
