package sec3;

public class Quiz3 {

	public static void main(String[] args) {
		// for문을 이용해서 1부터 100까지의 정수중 3의 배수의 총합을 출력하는 코드
				int sum=0;
				
				for(int a=0;a<100;a+=3){
					if(a%3==0){
						sum+=a;
			}
		}System.out.println("1부터 100까지의 정수 중에서 3의 배수의 총합 : "+sum);
	}
}
