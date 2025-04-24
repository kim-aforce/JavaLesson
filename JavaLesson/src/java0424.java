import java.util.ArrayList;

public class java0424 {
	public static void main(String[] args) {
		//点数[85, 92, 78, 65, 98, 70]
		//７０点以上得点
		ArrayList<Integer> iScore = new ArrayList<Integer>();
		iScore.add(85);
		iScore.add(92);
		iScore.add(78);
		iScore.add(65);
		iScore.add(98);
		iScore.add(70);
		
		//70点以上カウント
		int passcount = 0;
		for (int pass : iScore) {
			if (pass >= 70) {
				passcount++;
			}
		}
		System.out.println("70点以上の得点の数は"+passcount + "個です。");
		
		
		
		
	}
	
}