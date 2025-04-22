//=========================================================
//-----------------Java基礎①_値と演算_演習問題　第2章　値と演算----------------------------------
//=========================================================
public class java_kiso_1 {
	public static void main(String arg[]) {

//	問4.	変数 num に小数 4.5 を代入し、その値を半分にして表示するプログラムを作成してください。			
		double num4 = 4.5;
		System.out.println("問4：" + num4 / 2 + "\n");
		
//	問5.	変数 num に小数 7.8 を代入し、その値を整数部分と小数部分に分けて表示するプログラムを作成してください。									
		double num5 = 7.8;
		System.out.println("問5 : 整数は" + (int)num5 + "少数は" + (num5-7.0)+ "\n");
		
//	問6.	変数 num に小数 3.2 を代入し、その値を10倍にして表示するプログラムを作成してください。									
		double num6 = 3.2;
		System.out.println("問6：3.2の10倍は" +num6*10+ "\n");
//	問7.	変数 num に整数 0 を代入し、その値が0かどうかを判定するプログラムを作成してください。									
		int num7 = 0;
		if (num7 == 0) {
			System.out.println("問7：0です。"+ "\n");
		}else {
			System.out.println("問7：0ではありません。"+ "\n");
		}
//	問8.	変数 num に整数 -5 を代入し、その値が負の数かどうかを判定するプログラムを作成してください。									
		int num8 = -5;
		if (num8 < 0) {
			System.out.println("問8：0より小さいので負の数です。"+ "\n");
		}
//	問9.	変数 num に整数 15 を代入し、その値が5の倍数かどうかを判定するプログラムを作成してください。									
		int num9 = 15;
		if (num9 % 5 == 0) {
			System.out.println("問9：15は5の倍数"+ "\n");
		}else {
			System.out.println("やり直し");
		}
//	問10.	変数 num1 に整数 8 を、num2 に整数 3 を代入し、それらの和を計算して表示するプログラムを作成してください。									
		int num10 = 8;
		int num10a = 3;
		System.out.println("問10：「num10」と「num10a」の和は" + (num10+num10a)+ "\n");
		
//	問11.	変数 num1 に整数 10 を、num2 に整数 4 を代入し、それらの差を計算して表示するプログラムを作成してください
		int num11 = 10;
		int num11a = 4;
		System.out.println("問11：「num10」と「num11a」の差は" + (num11 - num11a)+ "\n");
//	問12.	変数 num1 に整数 6 を、num2 に整数 7 を代入し、それらの積を計算して表示するプログラムを作成してください。									
		int num12 = 6;
		int num12a = 7;
		System.out.println("問12：「num12」と「num12a」の積は" + (num12*num12a)+ "\n");
//	問13.	短い文章
//	「[名前]は次の誕生日で[年齢]歳です。」という文章を作成して出力します。
	String name = "キム ジョンユン";
	int age = 25;
	System.out.println("問13"+ name + "は次の誕生日で"+ age + "歳です。"+ "\n");
//問14.	四則演算
//	それらを使って、足し算、引き算、掛け算、割り算、余りを計算。
//	各計算結果を1行ずつ出力します。
		int num14 = 8;
		int num14a = 3;
		System.out.println("問14 : \n足し算　- " + (num14 + num14a));
		System.out.println("引き算 - " + (num14 - num14a));
		System.out.println("掛け算 - " + (num14 * num14a));
		System.out.println("割り算 - " + (num14 / num14a));
		System.out.println("余り - " + (num14 % num14a)+ "\n ");
//問15.	平均値の計算
//	3つの整数変数を宣言して値を代入します:
//	test1 = 75
//	test2 = 88
//	test3 = 92
//	3つの値の合計を計算。
//	平均値を計算し、表示します。
//	平均値は 整数型 で表します（小数点以下は切り捨て）。
		int test1 = 75;
		int test2 = 88;
		int test3 = 92;
		int testAvr = (test1 + test2 + test3) / 3;
		System.out.println("問15：test1, 2, 3の平均は" + (int)testAvr+ "\n ");
//問16.	12,000円の30%引きを計算するプログラムを書いてください。
		int num16 = 12000;
		double discount = num16 * 0.7;
		System.out.printf("問16：12,000円の30％引きの値段は %,d円%n", (int)discount);
		//%,dはNumberFormatを使ってコンマが表示できる。
//問17.	次のコードの出力は？ false
//問18.	次のコードの出力は？ true
//問19.	次のコードの出力は？ false
//問20.	次のJavaコードを見て、画面に表示される結果を答えなさい。 答え：割引対象
		
		
		
		
		
	}	
}