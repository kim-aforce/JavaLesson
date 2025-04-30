package 演習問題;

import java.util.Scanner;

public class java_kiso_4_if {
	public static void main(String[] args) {
		
		//Java基礎④-1_制御構文(if,switch)_演習問題　
		//問１
		Scanner sc1 = new Scanner(System.in);
		System.out.println("問１：整数を入力");
		int num1 = sc1.nextInt();	
		
		if(num1 % 2 == 0) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
		//問2
		Scanner sc2 = new Scanner(System.in);
		System.out.println("問2：整数を入力");
		int num2 = sc2.nextInt();	

		if (num2 < 0) {
			System.out.println("負け数");
		}else {
			System.out.println("正の数");
		}
		
		//問3
		Scanner sc3 = new Scanner(System.in);
		System.out.println("1つ目の辺の長さを入力");
		int tri1 = sc3.nextInt();
		System.out.println("2つ目の辺の長さを入力");
		int tri2 = sc3.nextInt();
		System.out.println("3つ目の辺の長さを入力");
		int tri3 = sc3.nextInt();
		
		 if (tri1 + tri2 > tri3 && tri1 + tri3 > tri2 && tri2 + tri3 > tri1) {
			 System.out.println("辺の長さは有効");
		 }else {
			System.out.println("無効な辺");
		}
		
		//問4
			Scanner sc4 = new Scanner(System.in);
			System.out.println("ご年齢を教えてください。");
			int age = sc4.nextInt();
		
			if (age <= 12) {
				System.out.println("無料");
			} else if (age > 13 && age <= 59) {
				System.out.println("1000円です。");
			}else if (age >= 60) {
				System.out.println("500円です。");
			}
		
		
		
		
	}
}