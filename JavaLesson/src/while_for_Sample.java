import java.util.ArrayList;

public class while_for_Sample {
	public static void main(String[] args) {
	ArrayList<String> employees = new ArrayList<>();
	employees.add("田中太郎");
	employees.add("山田花子");	
	employees.add("佐藤次郎");
	
	for(String employee : employees) {
		System.out.println(employee);
		}
	}
}
