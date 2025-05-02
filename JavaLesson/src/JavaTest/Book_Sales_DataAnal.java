package JavaTest;
								
//3.javadocを記載すること（要件1,2を優先で良い）									

import java.util.ArrayList;
import java.util.List;

public class Book_Sales_DataAnal {
	public static void main(String[] args) {
		List<BookData> BookDatas = new ArrayList<BookData>();
		//書籍名：著者：販売数：価格		
		BookDatas.add(new BookData("Python入門", "山田太郎", 1500, 2500));
		BookDatas.add(new BookData("データ分析の基礎", "鈴木花子", 1200, 3000));
		BookDatas.add(new BookData("AI技術最前線", "佐藤一郎", 800, 4000));
		BookDatas.add(new BookData("Webデザイン講座", "田中美咲", 2000, 2000));
		BookDatas.add(new BookData("はじめての機械学習", "中村健一", 900, 3500));
		
		
		//全書籍の総売上額を計算する機能		
		int total = 0;
		for(BookData totalsales : BookDatas) {
			total += totalsales.getsales();
		}
		System.out.println("全書籍の総売上額 : " + total + "万円");
		
		//販売数が1000冊を超える書籍を抽出する機能
				System.out.println("販売数が1000冊以上の書籍： ");
				for(BookData OverOneK : BookDatas) {
					if (OverOneK.sales > 1000) {
						System.out.print(OverOneK.title+"\n");
					}
				}
		
		//価格あたりの販売効率が最も高い書籍を特定する機能（販売数 / 価格)
		for(BookData CosPer : BookDatas) {
			
		}
	
		
	}
}
