package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		//問1
		double TAX = 0.1;
		System.out.println("消費税率は" + TAX);
		
		//問2
		int x = 480;
		double price = ((x * TAX) + x) ;
		System.out.println("xの税込み価格は"+price);
		
		//問3
		String name = "Kim JeongYun";
		System.out.println(name);
		
		//問4
		String str1 = "この商品の値段は";
		String str2 = "円です。";
		System.out.println(str1 + price + str2);
		
	}
}
