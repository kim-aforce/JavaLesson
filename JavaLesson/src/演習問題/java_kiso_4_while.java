package 演習問題;
import java.util.Scanner;

public class java_kiso_4_while {
	public static void main(String[] args) {
		//問１　1から10までの整数を順に表示するプログラムをwhileループを使って作成してください・
		int w1 = 0;
		while (w1 < 10) {
			w1++;
			System.out.print(w1);
		}
		//問２　1から１００までの整数の合計 while
		int w2 = 1;
		int w2sum = 0;
		while (w2 <= 100) {
			w2sum += w2; //
			w2++;
		}
		System.out.println("\nwhile 問2 : " + w2sum);
		
		//問3　ユーザーから整数を入力させて、０が入力されるまでの合計を計算して表示する
		 Scanner scanner = new Scanner(System.in);
	        int w3sum = 0;
	        int w3;
	        System.out.println("整数を入力（0を入力すると終了）：");
	        while (true) {
	            w3 = scanner.nextInt(); //整数を入力してもらう
	            if (w3 == 0) {
	                break; // 0なら終了
	            }
	            w3sum += w3; //入力された整数は足す
	        }
//	        System.out.println("\n 入力された整数の合計は " + w3sum + " です。");
	        
	        //do-while
	        // 問１　whileの問１と同じ
	        int dw1 = 0;
	        do {
	        	System.out.println( dw1);
	        	dw1++;
	        } while(dw1 < 10);
	        //問２　1から１００までの整数の合計
	        int dw2 = 1;
	        int dw2sum = 0;
	        do {
				dw2sum += dw2;
				dw2++;
			} while (dw2 <= 100);
	        System.out.println("問2　：　"+dw2sum);
	        //		問3　

	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}
}
