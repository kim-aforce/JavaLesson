package 演習問題;

import java.util.Scanner;

public class java_kiso_4_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//問3
		System.out.println("1 ~ 7を入力");
		int day = sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		default:
			System.out.println("日曜日");
			break;
		}
		
		//問4
		System.out.println("1 ~ 12まで入力");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("febuary");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("agust");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("november");
			break;
		default:
			System.out.println("december");
			break;
		}
		
		//問5
		System.out.println("1 ~ 7を入力");
		int rank = sc.nextInt();
		switch (rank) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		
		
		
		
		
		
		
	}
}
