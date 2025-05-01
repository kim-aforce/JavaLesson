package 演習問題;

import java.util.Scanner;



public class exception_practice {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		//問１
		System.out.println("整数を入力してください。");
		try {
			String putNum = sc1.nextLine();
			int number = Integer.parseInt(putNum);
			int result = number / 2;
			System.out.println(putNum +"は" +result +"で2に割れます。");
		} catch (NumberFormatException e) {
			System.out.println("正しい整数を入力してください " + e.getMessage());
		}
		sc1.close();
		
		//問5     	
		try {
			int putNum1 = 10;
			if (putNum1 % 0 == 0) {
				throw new Exception("0では割れません。");
			}
			System.out.println("0で割れた");
		} catch (Exception e) {
			System.out.println("例外発生 : " + e.getMessage());
		}
		
	}
}