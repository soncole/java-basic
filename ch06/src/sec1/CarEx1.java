package sec1;

import java.io.ObjectInputStream.GetField;

public class CarEx1 {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setCompany("현대");
		car1.setModel("아반떼");
		car1.setColor("White");
		car1.setMaxSpeed(250);
		System.out.println(car1.toString());
		
		
		Body body1 = new Body();
		body1.setStyle("세단");
		body1.setBumper("솔리드");
		body1.setFrendar("투썹");
		car1.setBody(body1);
		System.out.println(body1.toString());
		
		Tire tire1 = new Tire();
		tire1.setName("한국타이어");
		tire1.setCount(4);
		car1.setTire(tire1);
		System.out.println(tire1.toString());
		
		Engine engine1 = new Engine();
		engine1.setFuel("가솔린");
		engine1.setCc(1500);
		engine1.setDisplace(3);
		car1.setEngine(engine1);
		System.out.println(engine1.toString());
		
		

	}

}
