package sec2;

public class Example2 {

	public static void main(String[] args) {
		//바깥 for문은 안의 for문이 모두 실행되면 그때 카운트가 증가되고 안의 for문은 다시 처음부터 진행
		for(int i = 0;i < 6; i++){
			for(int j=0;j<5;j++){
				System.out.println(i+", "+j);
			}
		}

		for(int i=1;i<=4;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print("*");
			}System.out.println();
		}
	}

}
