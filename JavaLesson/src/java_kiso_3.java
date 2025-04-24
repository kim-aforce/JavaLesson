//==============================
//			Java基礎③_コレクション_演習問題
//==============================

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class java_kiso_3 {
	public static void main(String[] args) {
//		コレクションとは	
//		問1.	ArrayListを作成し、5つの整数を追加して、すべての要素を逆順に表示するプログラムを作成してください。
		List<Integer> collection1= new ArrayList<Integer>();
		collection1.add(1);
		collection1.add(2);
		collection1.add(4);
		collection1.add(4);
		collection1.add(5);
		collection1.sort(Comparator.reverseOrder());
		System.out.println("問1：逆ソート"+collection1);
//		問2.	ArrayListをHashSetに変換し、重複を削除した後の要素を表示するプログラムを作成してください。
		Set<Integer> collection2 =  new HashSet<>(collection1);
		System.out.println("問2："+collection2);
		
//		問3.	"ArrayListを作成し、以下の順に追加して、リストから「バナナ」を削除し、「オレンジ」を追加した結果をコンソールに出力してください。
//		リンゴ、バナナ、さくらんぼ
		List<String> collection3 = new ArrayList<String>(); 
		collection3.add("キーウィ");
		collection3.add("バナナ");
		collection3.add("すいか");
		System.out.println("問3：\n既存"+collection3);
		collection3.remove("バナナ");
		collection3.add(1, "オレンジ");
		System.out.println("追加"+collection3 + "\n＝＝＝＝＝＝＝＝＝\nここまでコレクションの演習問題\n");
		
//		リスト	
//		問1.	LinkedListを作成し、いくつかの文字列を追加して、リストの最初と最後の要素を表示するプログラムを作成してください。
		LinkedList<String> list = new LinkedList<String>(Arrays.asList("a","i","u","e","o"));
		System.out.println("問1：" +list.get(0) + list.get(4));
		
//		問2.	ArrayListを作成し、いくつかの整数を追加して、特定の値がリストに含まれているかどうかを確認するプログラムを作成してください。
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(3);
		list2.add(5);
		list2.add(7);
		System.out.println("問2：" +list2.contains(3)); //値がある場合TRUE
		
//		問3.	ArrayListを作成し、いくつかの文字列を追加して、アルファベット順にソートするプログラムを作成してください。
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("alpha");
		list3.add("chaley");
		list3.add("bravo");
		list3.add("delta");
		list3.sort(Comparator.naturalOrder());
		System.out.println("問3：" +list3 + "\n＝＝＝＝＝＝＝＝＝\nここまでリストの演習問題\n");
			
//		ハッシュとは	
//		問1.	HashMapを作成し、いくつかのキーと値のペアを追加して、特定のキーに対応する値を表示するプログラムを作成してください。
		
//		問2.	HashSetを作成し、いくつかの文字列を追加して、セットの要素をすべて表示するプログラムを作成してください。
			
//		問3.	HashMapを作成し、いくつかのキーと値のペアを追加して、すべてのキーと値を表示するプログラムを作成してください。
		
//		配列とリスト	
//		問1.	配列からリストへの変換
//			整数の配列を作成し、それをArrayListに変換して、リストの要素をすべて表示するプログラムを作成してください。
//			
//		問2.	リストから配列への変換
//			ArrayListを作成し、いくつかの文字列を追加して、それを配列に変換して、配列の要素をすべて表示するプログラムを作成してください。
//			
//		問3.	【シナリオ】
//			あなたは、学生の成績を管理するプログラムを作成しています。
//			学生の名前とその成績を保存し、成績の平均を計算して表示する必要があります。
//			学生の数は固定されており、追加や削除は行いません。
//			
//			【問題】
//			1. 上記のシナリオでは、配列とリストのどちらを使うのが良いでしょうか？理由を説明してください。
//			2. 選択したデータ構造を使って、学生の名前と成績を保存し、成績の平均を計算して表示するプログラムを作成してください。
		
		
		
		
		
		
		
		
	}
}
