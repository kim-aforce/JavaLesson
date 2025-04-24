import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountryCapital {
	public static void main(String[] args) {
		Map<String, String>  countryMap = new HashMap<>();
		
		countryMap.put("日本", "東京");
		countryMap.put("アメリカ合衆国", "ワシントンD.C");
		countryMap.put("フランス", "パリ");
		countryMap.put("中国", "北京");
		
		//全ての国名と首都表示
		System.out.println("全ての国名と首都");
		
		Set<String> key= countryMap.keySet(); //国名取得
		
		for(String country : key) {
			String capital = countryMap.get(country);
			System.out.println("国名 - " + country + " : 首都 - " + capital);
		}
		
		//「日」を含む国、その首都
		System.out.println("\n 「日」を含む国、その首都");
		for(String country : key) {
			if (country.contains("日")) {
				String capital = countryMap.get("日本");
				System.out.println(country + " : " + capital);
			}
		}
 	}
}