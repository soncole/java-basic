package sec2;

public class Car {
	String company;
	String model;
	int cc;
	String fuel;
	int speed;
	
	public void startUp(){
		System.out.println("시동을 켭니다.");
	}
	public void turnOff(){
		System.out.println("시동읍 끕니다.");
	}
	public int speedUp(){
		return ++speed;
	}
	public int speedDown(){
		return --speed;
	}
}
