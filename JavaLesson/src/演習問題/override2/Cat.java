package 演習問題.override2;
//問1.	AnimalクラスにmakeSoundメソッドを定義し、DogクラスとCatクラスでこのメソッドをオーバーライドしてください。
//それぞれのクラスのインスタンスを作成し、makeSoundメソッドを呼び出して音を表示するプログラムを作成してください。

public class Cat extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("猫はにゃんにゃん");
	}
}
