package 演習問題;
//1. 従業員情報（名前、部署、給与、勤続年数）を管理するクラスを作成してください。
//2. 以下の機能を実装してください：
//   - 部署ごとの平均給与を計算する機能
//   - 勤続年数に応じた昇給額を計算する機能（1年ごとに1万円昇給）
//   - 給与が高い順に上位3名を表示する機能
// 
//【使用するデータ】
//名前：部署：給与：勤続年数
//山田太郎：営業部：30万円：5年
//鈴木花子：開発部：35万円：3年
//佐藤一郎：営業部：28万円：1年
//田中美咲：人事部：32万円：4年
//中村健一：開発部：38万円：7年

import java.util.ArrayList;
import java.util.List;

public class ensyu7 {

	public static void main(String[] args) {
		
		List<EmployeeData> infoDatas = new ArrayList<EmployeeData>();
		infoDatas.add(new EmployeeData("山本太郎", "営業部", 30, "5年"));
		infoDatas.add(new EmployeeData("佐藤一郎", "営業部", 28, "1年"));
		infoDatas.add(new EmployeeData("鈴木花子", "開発部", 35, "3年"));
		infoDatas.add(new EmployeeData("中村健一", "開発部", 38, "7年"));
		infoDatas.add(new EmployeeData("田中美咲", "人事部", 32, "4年"));
		
		//   - 部署ごとの平均給与を計算する機能	
		List<Integer>salary = new ArrayList<Integer>();
		List<Integer>engineer = new ArrayList<Integer>();
		List<Integer>HR = new ArrayList<Integer>();
		
		for(EmployeeData EmpInfo : infoDatas) {
			String depart = EmpInfo.team;
			int PayperMonth = EmpInfo.pay;
			
			if (depart == "営業部") {
				salary.add(PayperMonth);
			}else if (depart == "開発部") {
				engineer.add(PayperMonth);
			}else {
				HR.add(PayperMonth);
			}
		}
		int AvrSalary = ((salary.get(0) + salary.get(1)) / salary.size());
		int AvrEngeer = ((engineer.get(0) + engineer.get(1)) / engineer.size());
		System.out.println("営業部の平均給与：" + AvrSalary + "万円");
		System.out.println("開発部部の平均給与：" + AvrEngeer + "万円");
		System.out.println("開発部部の平均給与：" + HR.get(0) + "万円\n");

		//		   - 勤続年数に応じた昇給額を計算する機能（1年ごとに1万円昇給）
		for(EmployeeData Empinfo : infoDatas) {
			int years = Integer.parseInt(Empinfo.career.replace("年", ""));
			int newPay = Empinfo.pay + years * 1;
			System.out.println(Empinfo.name + "さんの給与は" + newPay +  "万円です。");
		}
			
		System.out.println("\n");
		
//		   - 給与が高い順に上位3名を表示する機能
		infoDatas.sort((a, b) -> b.pay - a.pay);
		
		System.out.println("給与が高い社員TOP3：");
		for (int i = 0; i < 3 && i < infoDatas.size(); i++) {
			
			EmployeeData emp = infoDatas.get(i);
			System.out.println(emp.name + "さんが" + emp.pay + "万円");
		}
	}
}




















