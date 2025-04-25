
public class Person {
//問1.	クラス「Person」を作成し、名前（name）と年齢（age）のフィールドを持たせてください。
//コンストラクタを使って名前と年齢を初期化できるようにしてください。
//作成したクラスのインスタンスを生成し、フィールド値を表示してください。
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showPersoninfo() {
		System.out.println("名前は"+name + "です。年齢は"+age +"です。");
	}
	public static void main(String[] args) {
		Person me = new Person("Kim JeongYun", 24);
		
		me.showPersoninfo();
	}
}
