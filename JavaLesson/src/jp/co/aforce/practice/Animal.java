package jp.co.aforce.practice;

public class Animal {
	void speak() {
		System.out.println("sound");
	}
	
	public static void main(String[] args) {
		Animal c = new Cat();
		c.speak();
	}
}
