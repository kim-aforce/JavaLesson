
public class Book {
	String taitoru;
	String chosya;
	int kakaku;
//問2.	クラス「Book」を作成し、タイトル（title）、著者（author）、価格（price）をフィールドに持たせてください。
//showInfo()メソッドで本の情報を表示できるようにしてください。
	public void BookInfo(String title, String author, int price) {
		taitoru = title;
		chosya = author;
		kakaku = price;	
	}
	public void showInfo() {
		System.out.println("タイトル：" + taitoru);
		System.out.println("著者：" + chosya);
		System.out.println("価格：" + kakaku);
	}
	
	
	public static void main(String[] args) {
		Book Jump = new Book();
		
		Jump.taitoru = "ワンピース";
		Jump.chosya = "尾田栄一郎";
		Jump.kakaku = 400;
		
		Jump.showInfo();
	}
	
}
