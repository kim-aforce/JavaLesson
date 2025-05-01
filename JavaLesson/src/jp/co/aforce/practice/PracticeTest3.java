package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Comparator;

public class PracticeTest3 {
	public static void main(String[] args) {

		//問１
		String[] products = {"シャープペンシル", "ボールペン", "リングノート", "クリップ", "消しゴム"};
		
		//問2
		System.out.println(products[1]);
		
		//問3
		ArrayList<String> name = new ArrayList<String>();
		name.add("山田太郎");
		name.add("鈴木花子");
		name.add("佐藤次郎");
		name.add("山田太郎"); //16行目と別人
		name.add("高橋三郎");
		
		//問4　excel
		//問5
		System.out.println(name.get(2));
		//問6
		ArrayList<Integer> list1 = new ArrayList<>();				
		list1.add(10);				
		list1.add(15);				
		list1.add(16);				
		list1.add(19);				
						
		ArrayList<Integer> list2 = new ArrayList<>();				
		list2.add(11);				
		list2.add(12);				
		list2.add(18);				
		list2.add(20);				
		//統合
		list1.addAll(list2);
		//昇順
		list1.sort(Comparator.naturalOrder());
		
		for(int integrateList : list1) {
			System.out.println(integrateList);
		}
		
		//問7
		ArrayList<Integer> list3 = new ArrayList<>();				
		list3.add(13);				//index 3
		list3.add(14);				//index 4
		list3.add(17);				//index 7
		list3.add(21);				//index 11
		
		int newAL1 = list3.get(0);
		int newAL2 = list3.get(1);
		int newAL3 = list3.get(2);
		int newAL4 = list3.get(3);
		
		list1.add(3, newAL1);
		list1.add(4, newAL2);
		list1.add(7, newAL3);
		list1.add(11, newAL4);

		System.out.println(list1);
		
		
		
		
		
	}
}





