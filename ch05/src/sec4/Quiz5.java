package sec4;

public class Quiz5 {

	public static void main(String[] args) {
		//순서대로 정렬 40 50 60 70 80 90 오름차순으로 정렬 , 반대로 내림차순으로 정렬 하는 코드
		//선택정렬 selection sort
		int[] arr = {70, 50, 90, 80, 40, 60};
		int a;
		int b;
		int tmp = 0;
		for(a=0;a<arr.length;a++){
			for(b=a+1;b<6;b++){
				if(arr[a]>arr[b]){
				tmp = arr[a];
				arr[a] = arr[b];
				arr[b] = tmp;		
				}
			}
		}
		System.out.println("오름차순 정렬 : ");
		for(a=0;a<arr.length;a++){
			System.out.printf("%d\t", arr[a]);
	}
}
	

}
