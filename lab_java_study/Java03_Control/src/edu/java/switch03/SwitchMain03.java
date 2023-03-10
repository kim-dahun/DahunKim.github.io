package edu.java.switch03;

public class SwitchMain03 {

	public static void main(String[] args) {
		//enum 타입을 사용하는 switch case

		// Season enum 타입 변수를 선언하고 값을 겨울(WINTER)로 초기화.
		
		Season s = Season.SPRING;
		
		switch(s) {
		case SPRING: // 변수 선언 시에만 enum을 호출, case 작성 시에는 enum 내 값만 입력
			System.out.println("봄");
			break;
			
		case SUMMER:
			System.out.println("여름");
			break;
			
		case FALL:
			System.out.println("가을");
			break;
			
		case WINTER:
			System.out.println("겨울");
			break;
			
		}
			
	}

}
