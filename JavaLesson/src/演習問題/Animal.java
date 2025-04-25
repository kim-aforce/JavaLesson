package 演習問題;
//問1.	AnimalクラスにmakeSoundメソッドを定義し、DogクラスとCatクラスでこのメソッドをオーバーライドしてください。
//	それぞれのクラスのインスタンスを作成し、makeSoundメソッドを呼び出して音を表示するプログラムを作成してください。

public class Animal {
	
	public void makeSound() {}
	
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		
		dog.makeSound();
		cat.makeSound();
	}
}
