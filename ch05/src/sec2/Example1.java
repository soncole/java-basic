package sec2;

public class Example1 {

	public static void main(String[] args) {
		//문자열과 문자배열
		String str1 = "java program";
		char[] c_arr = {'j','a','v','a',',','p','r','o','g','r','a','m'};
		//기본출력
		System.out.println(str1);
		System.out.println(c_arr);
		
		//개별 문자요소 접근
		for(char data : c_arr){ //문자 배열 요소 접근
			System.out.print(data);
		}
		
		System.out.println();
		
		for(int i=0;i<str1.length();i++){
			System.out.println(str1.charAt(i));
		}	
		
		System.out.println();
		
		String id = "981227-1234567";
		char m = id.charAt(7);
		System.out.println(m);
		
		switch(m){
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
			default:
				System.out.println("외국인");
				break;


		}
	}		
}