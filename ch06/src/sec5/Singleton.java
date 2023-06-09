package sec5;

public class Singleton {
	//private static 클래스명 singleton = new 생성자함수() - 외부에서 생성하지 못하게끔
	private static Singleton singleton = new Singleton();
	//private 생성자함수 () {} - 외부에서 생성하지 못하게끔
	private Singleton(){}
	//public static 클래스명 getInstance(){return singleton;}
	public static Singleton getInstance() { return singleton; }
}
