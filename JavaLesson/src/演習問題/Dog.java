package 演習問題;
//問1.	AnimalクラスにmakeSoundメソッドを定義し、DogクラスとCatクラスでこのメソッドをオーバーライドしてください。
//それぞれのクラスのインスタンスを作成し、makeSoundメソッドを呼び出して音を表示するプログラムを作成してください。

public class Dog extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("犬はワンワン");
	}
}
