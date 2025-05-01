package 演習問題;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class java250430 {
	
	static class ensyu6{
		int value1, value2;
		String key;
		
		public ensyu6(String key, int japanese, int foreigner) {
			this.key = key;
			this.value1 = japanese;
			this.value2 = foreigner;
		}
	}
	public static void main(String[] args) {
		//演習１
		int score = 62;
		
		if(score >= 60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
		//演習２	
		int score2 = 12;
		boolean submittedReport = true;
		if(score2 >= 60 || !submittedReport) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
		//演習３
		for(int num = 0; num <= 9; num++) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		//演習４
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("りんご");
		fruits.add("みかん");
		fruits.add("ぶどう");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//演習５
		int castVar = 5;
		System.out.println((double)castVar);
		double castVar2 = 6.9;
		System.out.println((int)castVar2);
		
		//演習６
		Map<String, ensyu6> tourListMap = new HashMap<String, java250430.ensyu6>();
		
		tourListMap.put("東京", new ensyu6("東京", 150, 250));
		tourListMap.put("大阪", new ensyu6("大阪", 120, 180));
		tourListMap.put("京都", new ensyu6("京都", 80, 120));
		tourListMap.put("福岡", new ensyu6("福岡", 50, 80));
		tourListMap.put("札幌", new ensyu6("札幌", 40, 60));
	
		
		System.out.println(tourListMap);
		
		}
}