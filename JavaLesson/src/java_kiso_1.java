public class java_kiso_1 {
	public static void main(String arg[]) {

//	問4.	変数 num に小数 4.5 を代入し、その値を半分にして表示するプログラムを作成してください。			
		double num4 = 4.5;
		System.out.println("問4：" + num4 / 2);
		
//	問5.	変数 num に小数 7.8 を代入し、その値を整数部分と小数部分に分けて表示するプログラムを作成してください。									
		double num5 = 7.8;
		System.out.println("問5 : 整数は" + (int)num5 + "少数は" + (num5-7.0));
		
//	問6.	変数 num に小数 3.2 を代入し、その値を10倍にして表示するプログラムを作成してください。									
		double num6 = 3.2;
		System.out.println("問6：3.2の10倍は" +num6*10);
//	問7.	変数 num に整数 0 を代入し、その値が0かどうかを判定するプログラムを作成してください。									
		int num7 = 0;
		if (num7 == 0) {
			System.out.println("問7：0です。");
		}else {
			System.out.println("問7：0ではありません。");
		}
//	問8.	変数 num に整数 -5 を代入し、その値が負の数かどうかを判定するプログラムを作成してください。									
		int num8 = -5;
		if (num8 < 0) {
			System.out.println("問8：0より小さいので負の数です。");
		}
//	問9.	変数 num に整数 15 を代入し、その値が5の倍数かどうかを判定するプログラムを作成してください。									
		int num9 = 15;
		if (num9 % 5 == 0) {
			System.out.println("問9：15は5の倍数");
		}else {
			System.out.println("やり直し");
		}
//	問10.	変数 num1 に整数 8 を、num2 に整数 3 を代入し、それらの和を計算して表示するプログラムを作成してください。									
		int num10 = 8;
		int num10a = 3;
		System.out.println("問10：「num10」と「num10a」の和は" + (num10+num10a));
		
//	問11.	変数 num1 に整数 10 を、num2 に整数 4 を代入し、それらの差を計算して表示するプログラムを作成してください
		int num11 = 10;
		int num11a = 4;
		System.out.println("問11：「num10」と「num11a」の差は" + (num11 - num11a));
//	問12.	変数 num1 に整数 6 を、num2 に整数 7 を代入し、それらの積を計算して表示するプログラムを作成してください。									
		int num12 = 6;
		int num12a = 7;
		System.out.println("問12：「num12」と「num12a」の積は" + (num12*num12a));
	}
}