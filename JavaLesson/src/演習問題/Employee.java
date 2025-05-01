package 演習問題;

import java.util.Scanner;

public class Employee {
	
//問4.	クラス「Employee」を作成し、ID、名前、給与をフィールドとして持たせてください。
//給与を昇給させるraiseSalary(double percent)メソッドを実装し、昇給後の給与を表示してください。
	String id, name;
	int pay;
	
	public Employee(String id, String name, int pay) {
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	//給与を昇格させるメソッド
	public void raiseSalary(double percent) {
	
		pay += (int)pay * (percent / 100);
		System.out.println("昇格後の給与："+ pay +"円");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("あなたの給与を教えてください。");
		int howMuchPayNow = scanner.nextInt();
		
		Employee PayUp = new Employee("001", "金貞潤", howMuchPayNow);
		PayUp.raiseSalary(12.0);
	}
}