package dao;

import sec5.Mix;

public class MixEx1 {

	public static void main(String[] args) {
		Mix mix1 = new Mix();
		//필드의 접근
		mix1.field1 = 10;
		//mix1.field2 = 20; //protected
		//mix1.field3 = 30; //default
		//mix1.field4 = 40; //private
		
		//메소드 호출
		mix1.method1();
		//mix1.method2(); // protected
		//mix1.method3(); // default
		//mix1.method4(); // private
		
		Mix2 mix2 = new Mix2();
		mix2.field1 = 10; // <public
		mix2.field2 = 20; // <protected (상속 받았으므로 사용가능)
		
		mix2.method1();
		mix2.method2();

	}

}
