package sec1;

public class Example8 {

	public static void main(String[] args) {
		char a = 'a';
		char b = '아';
		char c = 95;
		char d = 1000;
		int e = Character.MIN_VALUE;
		int f = Character.MAX_VALUE;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("character의 바이트 크기 : "+Character.BYTES);
		System.out.println("character의 범위 : "+e+"~"+f);
	
	}

}
