package sec3;

public class SystemEx3 {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		long sum = 0;
		for(int i=0;i<=10000000;i++){
			sum+=i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("합산 결과 : "+sum);
		System.out.println("소요 시간(나노초) : "+(time2-time1));
	}

}
