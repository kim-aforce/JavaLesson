
public class Student {
//問3.	クラス「Student」を作成し、名前と成績（配列）を持たせてください。
//成績の平均を計算して表示するメソッドを作成してください。
	String stuName;
	int [] stuScore;
	
	
	
	//constructor
	public Student(String stuName, int[] stuScore) {
		
		this.stuName = stuName;
		this.stuScore = stuScore;
	}
	//平均点数を求めるメソッド
	public void AverageCalculate() {
		
		int scoreSum = 0;
		for(int score : stuScore) {
			scoreSum += score;
		}
		double average = scoreSum / stuScore.length;
		System.out.println("名前 : " + stuName + ", 平均点数 : " + average);
	}

	
	public static void main(String[] args) {
		//new intの中に点数入力
		Student tanaka = new Student("田中", new int[]{70, 82, 95, 91, 59});
		tanaka.AverageCalculate();
	}
}