package 演習問題.ensyu6;

import java.util.HashMap;
import java.util.Map;

public class ensyu6{
	int japanese, foreign;
	String city;
	
	public ensyu6(String city, int japanese, int foreign) {
		this.city = city;
		this.japanese = japanese;
		this.foreign = foreign;
	}
	public int getTotal() {
		return japanese + foreign;
	}
	public double getForeign() {
		return (double) foreign / getTotal();
	}
	
	public static void main(String[] args) {
		
		Map<String, ensyu6> tourListMap = new HashMap<String, ensyu6>();
		
		tourListMap.put("東京", new ensyu6("東京", 150, 250));
		tourListMap.put("大阪", new ensyu6("大阪", 120, 180));
		tourListMap.put("京都", new ensyu6("京都", 80, 120));
		tourListMap.put("福岡", new ensyu6("福岡", 50, 80));
		tourListMap.put("札幌", new ensyu6("札幌", 40, 60));
		
		//全都市の総観光客数
		int total = 0;
		for(ensyu6 city : tourListMap.values()) {
			total += city.getTotal();
		}
		System.out.println("全都市の総観光客数は" + total + "万人");
		
		//100万人以上の都市
		System.out.print("観光客が１００万人以上の都市： ");
		for(ensyu6 city : tourListMap.values()) {
			if (city.getTotal() > 100) {
				System.out.print(city.city+" ");
			}
		}
		
		//外国人の割合が最も高い都市
		String foreignTop = ""; //外国人割合が高い都市を保存する変数
		double MaxRate = 0; //割合を保存する変数
		
		for(ensyu6 city : tourListMap.values()) {
			double rate = city.getForeign(); //rateに外国人数を保存
			if (rate > MaxRate) {			//最大値より都市の割合が高いと、
				MaxRate = rate;			//MaxRateにrateを保存
				foreignTop = city.city;	//割合が高い都市名を保存
			}
		}
		
		System.out.println("\n外国人の割合が最も高い都市：" + foreignTop);
			
		
	}
	
}

