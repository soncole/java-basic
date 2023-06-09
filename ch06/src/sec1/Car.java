package sec1;

public class Car {
	//필드 - 접근제한자를 private로 걸어주면 다른곳에서 사용X, private을 걸어놓고 다른곳에서 get, set 메소드를 이용하여 접근 (보안용이)
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;	
	
	Body body;
	Engine engine;
	Tire tire;
	
	//생성자
	
	//메소드
	

	public String getCompany() {
		return company;
	}
	
	



	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color="
				+ color + "]";
	}





	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
}
