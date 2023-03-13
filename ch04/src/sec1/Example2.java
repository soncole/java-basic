package sec1;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호 입력[1=10] : ");
		int num = sc.nextInt();
		System.out.println("국어 점수 입력[0-100] : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수 입력[0-100] : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수 입력[0-100] : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double avg = tot / 3.0f;
		
		String pan = "", remark = "";
		
		
		//if~else~문
		if( kor>=60 && eng>=60 && mat>=60 && avg>=80){
			pan = "합격";			
	}		else{
		pan = "불합격";
	}
		
		if ( kor>=90 || eng>=90 || mat>=90){
			remark = "과목우수";
		}	else{
			remark = "";
		}
		
	
		//if~else if~else문
		String hak = "";
		if(avg>=90){
			hak = "A";
		}else if(avg>=80){
			hak = "B";
		}else if(avg>=70){
			hak = "C";
		}else if(avg>=60){
			hak = "D";
		}else{
			hak = "집에가";
		}
		System.out.println("번호 : "+num);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		System.out.println("판정 : "+pan);
		System.out.println("참고사항 : "+remark);
		System.out.println("학점 : "+hak);
	}

}
