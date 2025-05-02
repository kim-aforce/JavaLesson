package JavaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {			
    //記述シート問題
    	Scanner sc = new Scanner(System.in);
    	
    	//問7
    	System.out.println("年齢を入金してください");
    	int inputAge = sc.nextInt();
    	
    	if (inputAge <= 3 && inputAge > 0) {
			System.out.println(inputAge+"歳は無料です。");
		} else if (inputAge >= 4 && inputAge <= 12) {
			System.out.println(inputAge+"歳は500円です。");
		} else if (inputAge >= 13 && inputAge <= 17) {
			System.out.println(inputAge+"歳は800円です。");
		} else if (inputAge >= 18 && inputAge <= 59) {
			System.out.println(inputAge+"歳は1200円です。");
		} else if (inputAge >=60 && inputAge <= 120) {
			System.out.println("700円です。");
		} else if(inputAge > 120){
			System.out.println("非常識な入力です。");	
		}	else {
			System.out.println("非常識な入力です。");
		}
    	
    	System.out.println("\n");
    	
    	//問8
    	ArrayList<String> fruits = new ArrayList<String>();
    	
    	fruits.add("リンゴ");
    	fruits.add("バナナ");
    	fruits.add("さくらんぼ");
    	System.out.println("元のfruits出力：" + fruits);
    	
    	fruits.remove(1);
    	fruits.add(1, "オレンジ");
    	System.out.println("削除・追加した後の出力：" + fruits);
    	
  
    	System.out.println("\n");
    	//問9
    	
//    	1. 購入金額割引:
//    		購入金額が5,000円以上の場合、合計金額から5%が割引されます。
//    		購入金額が10,000円以上の場合、合計金額からさらに5%（合計10%）が割引されます。
//    	2. 購入個数割引:
//    		購入個数が3個以上の場合、合計金額から1個あたり50円が割引されます。
//    		購入個数が5個以上の場合、合計金額から1個あたり100円が割引されます。
//
//    		消費税率は10%とします。
    	
    	
    	System.out.println("商品の単価を入力してください。");
    	int price = sc.nextInt();
    	
    	System.out.println("購入個数を入力してください。");
    	int qty = sc.nextInt(); 
    	
    	int total = price * qty;
    	
    	double dis1 = ((total * 0.95)-(qty * 50));
    	double dis2 = ((total * 0.9)-(qty * 100));
    	
    	double tax = total * 1.1;
    	
    	if (price >= 5000 && qty >= 3) {
    		System.out.println("商品の単価："+ price+"\n購入個数：" + qty + "\n割引前の合計金額：" + total);
    		System.out.println("割引額：" + ((total * 0.05)+(qty * 50)) + "円");
    		System.out.println("割引後の価格" + dis1 + "円");
    		System.out.println("消費税額：" + total * 0.1);
    		System.out.println("税込価格：" + (int)tax);
    		
		}else if (price >= 10000 && qty >= 5) {
			System.out.println("商品の単価："+ price+"\n購入個数：" + qty + "\n割引前の合計金額：" + total);
    		System.out.println("割引額：" + ((total * 0.1)+(qty * 100)) + "円");
    		System.out.println("割引後の価格" + dis2 + "円");
    		System.out.println("消費税額：" + total * 0.1);
    		System.out.println("税込価格：" + (int)tax);
		}
    	
    	//問10
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }							
}
