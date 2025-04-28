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
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("問2：整数を入力");
		int num2 = sc2.nextInt();	

		if (num2 < 0) {
			System.out.println("負け数");
		}else {
			System.out.println("正の数");
		}
		
	}
}