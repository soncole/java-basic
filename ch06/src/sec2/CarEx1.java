package sec2;

public class CarEx1 {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.startUp();
		
		for(int a=0;a<100;a++){
			car1.speedUp();
		}
		System.out.println("현재 속도 : "+car1.speed);
		
		for(int a=0;a<100;a++){
			car1.speedDown();
		}
		System.out.println("현재 속도 : "+car1.speed);
		
		car1.turnOff();
	}

}
