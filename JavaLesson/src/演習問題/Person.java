package 演習問題;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showinfo() {
		//名前と年齢表示
		System.out.println("名前は"+name + "です。年齢は"+age +"です。");
	}
	
	public static void main(String[] args) {
		Person me = new Person("キム・ジョンユン", 24);
		me.showinfo();
	}
}
