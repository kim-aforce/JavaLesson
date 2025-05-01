package 演習問題;

public class java_kiso4_for {
	public static void main(String[] args) {
		
		//問1
		for (int f1 = 1; f1 <= 10; f1++) {System.out.print(f1+"  ");}
		
		//問2
		int f2sum = 0;
		for(int f2 = 1; f2 <= 100; f2 ++) {
			f2sum += f2;
		}
		System.out.println("\n"+f2sum);
		
		//問3
		int fivo1=0 , fivo2 = 1;
		for(int i = 1; i <= 10; i++) {
			System.out.print(fivo1+"  ");
			
			int next = fivo1 + fivo2;
			fivo1 = fivo2;
			fivo2 = next;
		}
		
		
		
		
	}
}
