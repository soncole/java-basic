package sec3;

import java.io.IOException;

public class SystemInReadEx1 {

	public static void main(String[] args) throws IOException {
		
		int speed = 0;
		int keyCode = 0;
		
		while(true){
			keyCode = System.in.read();
			if(keyCode !=13 && keyCode !=10){
				if(keyCode == 49){
					speed++;
				}else if(keyCode == 50){
					speed--;
				}else if(keyCode == 51){
					break;
				}
			}
		}
		System.out.println("현재 속도 : "+speed);
		System.out.println("프로그램이 종료되었습니다.");
	}

}
