package sec4;

import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		int[] arr = {80, 90, 75, 85, 100};
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean tf = true;
		String student = sc.nextLine();
		String score = sc.nextLine();
		int num = sc2.nextInt();
		
		while(tf){
			System.out.println("--------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------");
			System.out.println("선택> "+num);
			if(num==1){
				System.out.println("학생수> "+student);
				
			}else if(num==2){
				System.out.println("");
			}
		}
		
		

	}

}
