

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChecknumberList {
	public static void main(String[] args) {
//===========================
//		if文　問題
//===========================		
	List<String> intSize = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	int ranNum = sc.nextInt();
	
	intSize.add("small");
	intSize.add("large");
	
	if(ranNum > 10) {
		System.out.println(intSize.get(1));
	} else {
		System.out.println(intSize.get(0));
	}
		
	}
}
