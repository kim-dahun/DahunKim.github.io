package edu.java.loop01;

public class LoopMain01 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		
		
		System.out.println("-----------------------");
		
		String a = "★";
		
		// for 반복문
		// 1. 초기화 -> 2. 조건식 확인 -> 3. 실행문 -> 4. 변수값 변경
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
			
		
		}
		// 증가 연산자(++), 감소 연산자(--): 변수의 값을 1씩 증가/감소. <단항연산자>
		// 증가/감소 연산자는 변수 앞 또는 변수 뒤에 사용. x++, ++x 모두 가능
		
		System.out.println("-----------------------");
		
		for (int n1 = 10; n1 > 0; n1--) {
			System.out.println(n1);
		}
		
		// 지역 변수(local variable) : 메서드 블록 ({}) 안에서 선언한 변수.
		// 지역 변수는 선언된 위치에서 변수가 속한 메서드 블록({}) 안에서만 사용이 가능
		// for () 구문에서 선언하는 변수는 for 블록 안에서만 사용 가능한 지역 변수
				
		int x = 1;
		{
			
			int y = 2; 
			System.out.println(x); // x는 블록 안팎에서 사용 가능
			System.out.println(y); // y는 블록 안에서만 사용 가능, 블록을 벗어나면 사라지는 변수
			// Ctrl+/: 커서가 있는 줄( 또는 선택된 줄) 주석 토글
		}
		
		
		
		
		
	}

}
