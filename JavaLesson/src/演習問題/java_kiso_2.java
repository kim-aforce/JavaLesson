package 演習問題;

import java.util.Scanner;

public class java_kiso_2 {
	public static void main(String arg[]) {
//		問1.	変数を宣言して値を表示しよう
//		整数型の変数 num を作成し、10 を代入する。
//		num の値を画面に表示する。
		int num1 = 10;
		System.out.println("問１：numの値 - " + num1 + "\n");
//	問2.	数値の計算をしよう
//		整数型の変数 a に 8 を代入する。
//		整数型の変数 b に 5 を代入する。
//		a と b の和を求め、sum という変数に代入する。
//		sum の値を画面に表示する。
		int num2a = 8;
		int num2b = 5;
		int sum2 = num2a + num2b;
		System.out.println("問２：aとbのsumは" + sum2);
//	問3.	面積を計算しよう
//		整数型の変数 width (幅) に 7 を代入する。
//		整数型の変数 height (高さ) に 4 を代入する。
//		長方形の面積 を求め、area という変数に代入する。
//		area の値を画面に表示する。
		int width = 7;
		int height = 4;
		int area = width * height;
		System.out.println("問3：面積は" + area);
//	問4.	いろいろなデータ型を使おう
//		次の3つのデータ型を使って変数を宣言し、それぞれの値を表示するプログラムを作成してください。
//		文字列型 (String) の変数 name に "Java" を代入する。
//		小数 (double) の変数 version に 17.0 を代入する。
//		真偽値 (boolean) の変数 isFun に true を代入する。
		String name = "Java";
		double version = 17.0;
		boolean isFun = true;
		System.out.println("問4：" + name + version + isFun);
//	問5.	ユーザーからの入力を受け取ろう
//		（ユーザーが "太郎" と入力した場合）
//		Scanner を使ってユーザーの名前を入力させる。
//		こんにちは, [名前] さん！ というメッセージを表示する。
		Scanner namesc = new Scanner(System.in);
		System.out.println("What your name? : ");
		
		String inputNameString = namesc.nextLine();
		System.out.println("こんにちは、" + inputNameString + "さん！");
		
//	問6.	自分の名前、年齢、誕生日を入力し、それらの情報を特定のフォーマットでコンソールに出力してください。
//		例えば「名前: エイフォース 太郎, 年齢: 30歳, 誕生日: 1995-05-15」のように表示します。
//		※「String.format」を使用すること。
		Scanner info = new Scanner(System.in);
		
		System.out.println("名前は？");
		String nameinfo = info.nextLine();
		
		System.out.println("年齢は？");
		int ageinfo = info.nextInt();
		
		System.out.println("誕生日は？");
		String birthinfo = info.next();
		
		System.out.println("名前："+ nameinfo + "　年齢：" + ageinfo + "　誕生日は："+ birthinfo);
		
//	問7.	問題: 商品の名前、価格、購入個数を入力し、複数購入した場合の合計金額をコンソールに出力してください。
//		例えば、次の通り出力します。
//		「商品: Laptopは、価格：1200円なので、3個買うと3600円です。」
		Scanner productInfoSc = new Scanner(System.in);
		
		System.out.println("購入品");
		String productName = productInfoSc.nextLine();
		System.out.println("価格");
		int productPrice = productInfoSc.nextInt();
		System.out.println("数量");
		int productQty = productInfoSc.nextInt();
		
		System.out.println("商品: " + productName + "は、"+"価格："+ productPrice +"円なので "+ productQty+"個買うと"+productPrice*productQty+"円です。");
		
		
		
		
		
		
		
		
		
		
		
	}
}
;