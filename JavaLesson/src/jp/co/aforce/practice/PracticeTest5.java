package jp.co.aforce.practice;
import java.util.ArrayList;

public class PracticeTest5 {
	public static void main(String[] args) {
		
		//問２
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println("\n");		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + "		");
			}
			System.out.println("\n");
		}
		//問4
		
		for (int i = 10; i <= 19; i++) {
			for (int j = 10; j <= 19; j++) {
				System.out.print(i * j + "	  ");
			}
			System.out.println("\n");
		}
		//問5
		ArrayList<String> employees = new ArrayList<>();					
		employees.add("斎藤");					
		employees.add("田中");			//未提出		
		employees.add("山田");			//未提出		
		employees.add("鈴木");			//未提出
		employees.add("高橋");					
		ArrayList<String> submitters = new ArrayList<>();					
		submitters.add("斎藤");					
		submitters.add("高橋");			
		
		
	}
}