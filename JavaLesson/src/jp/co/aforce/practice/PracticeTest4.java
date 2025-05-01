package jp.co.aforce.practice;

import java.util.Calendar;

public class PracticeTest4 {
	public static void main(String[] args) {
	
		//問題2
		String[] Animal = {"犬", "猫", "うさぎ", "へび"};
		
		//問3
		String dog = "犬";
		String msg = "はリストに入っていません。";
		
		for(int i = 0; i < Animal.length; i++) {
			if (Animal[i].equals(dog)) {
				msg = "はリストに入っています。";
			}
		}
		System.out.println(dog+msg);
		
		
		//問4
		Calendar calender = Calendar.getInstance();
		
		int month = calender.get(Calendar.MONTH) + 1;
		System.out.println(month);
		
		String message;
		
		switch (month) {
		case 1:
			//変数messageにメッセージを代入します。
			//case内で直接コンソールに出力しても構いません。
			message = "冬物セール";
			//breakを忘れずに記入します。
			break;

		case 2:
		case 3:
		case 4:
			message = "春物を売る";
			break;

		case 5:
			message = "春物セール";
			break;

		case 6:
		case 7:
			message = "夏物を売る";
			break;

		case 8:
			message = "夏物セール";
			break;

		case 9:
			message = "秋物を売る";
			break;

		case 10:
		case 11:
		case 12:
			message = "冬物を売る";
			break;

		default:
			message = "不正な月です";
			break;
		}

		//コンソールに出力
		System.out.println(message);
	}
		
}

