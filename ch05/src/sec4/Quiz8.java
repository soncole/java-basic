package sec4;

public class Quiz8 {

	public static void main(String[] args) {
		int[][] array = {{95,86}, {83,92,96}, {78,83,93,87,88}};
		int a, b;
		int sum = 0;
		float avg = 0.0f;
		int count = 0;
		for(a=0;a<array.length;a++){
			for(b=0;b<array[a].length;b++){
				sum += array[a][b];
				count++;
			}
		}
			avg = (float) sum / count;
			System.out.println("전체 점수 합계 : "+sum);
			System.out.println("평균 : "+avg);
	}

}
