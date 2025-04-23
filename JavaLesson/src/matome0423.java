
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class matome0423 {
	public static void main(String[] args) {
		
		System.out.println("購入する果物入力してください。");
		Scanner sc = new Scanner(System.in);
		String kyaku = sc.nextLine();
		Map<String, Integer> kudamono = new HashMap<>();
		
		kudamono.put("りんご", 100);
		kudamono.put("みかん", 80);
		kudamono.put("バナナ", 120);
		kudamono.put("いちご", 300);
		
		if (kudamono.containsKey(kyaku)) {
			int price = kudamono.get(kyaku);
			System.out.println(kyaku +" : " +price + "円");
		}else {
			System.out.println("申し訳ございません、うちの店ではお売りしません。");
		}
		
	}
}
