package 演習問題.override2;

public class Person {
	String name; int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//object classが裏で動いてる。
	
	@Override
	public String toString() {
		return name + "は"+ age +"歳";
	}
	public static void main(String[] args) {
		Person p1 = new Person("大谷", 29);
		Person p2 = new Person("ダルビッシュ", 38);

		System.out.println(p1); //.toString()　省略されてる
		System.out.println(p2);
	}
}
