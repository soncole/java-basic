package sec4;

public class Quiz7 {

	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		int a;
		int max=0;
		for(a=0;a<array.length;a++){
			if(a == 3)
				max = array[a];
		}
		System.out.println("최대값 : " +max);
	}

}
