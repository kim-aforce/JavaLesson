package 演習問題;

public class Car {
	String brand, model;
	int price;
	
	public Car() {
	        this.brand = "Ferrari";
	        this.model = "La Ferrari";
	        this.price = 3;
	}
	
	public void CarInfo() {
		System.out.println(brand+"の"+model+"です。");
		System.out.println("価格は" + price +"億円です。");
	}
	
	public static void main(String[] args) {
		Car ferrari = new Car();
		
		ferrari.CarInfo();
	}
	
}
