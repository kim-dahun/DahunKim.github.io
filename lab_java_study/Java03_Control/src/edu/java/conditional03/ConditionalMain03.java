package edu.java.conditional03;

import java.util.Scanner;

public class ConditionalMain03 {

	public static void main(String[] args) {
		
		// 간단한 성적 처리 프로그램
		// 3과목 시험, JAVA, SQL, HTML 
		// 세과목 평균 내기
		// 90 > A , 80 > B, 70 > C 60 > D 60 이하는 E
		
		// Ctrl + Space = 코드 추천 기능 
		// Ctrl + f11 = 자바 실행 기능
		
		// 논리 연산자 && = and / || = or
		// 연산자의 종류 : = / 산술 / 비교 / 논리 / 복합대입 / 증감 / 삼항연산자
		
		
		Scanner sc1 = new Scanner(System.in); // 입력장치 스캐너를 사용할 준비 완료
		
		System.out.println("java 과목 점수를 입력해주세요");
		int java = sc1.nextInt();
		System.out.println("sql 과목 점수를 입력해주세요");
		int sql = sc1.nextInt();
		System.out.println("html 과목 점수를 입력해주세요");
		int html = sc1.nextInt();
		
		System.out.println("\n학생의\n\n java 점수는 " + java + " 점,\n sql 점수는 " + sql + " 점,\n html 점수는 " + html + " 점 입니다.\n");
		
		int sum = java + sql + html; // 콘솔에 입력받은 변수 값 합산
		
		System.out.println("학생의 총점은 : " + sum + " 점 입니다.\n");
		
		double avg = (double) sum / 3; // sum 변수를 double로 casting 후 3으로 나눔. 
		
		System.out.println("학생의 평균점은 : " + avg + " 점 입니다.\n");
		String str1;
		
		if (avg >= 90 ) {
			str1 = "A";
			System.out.println("해당 학생은 장학입니다\n");
		}
		
		else if (avg >= 80 ) {
			str1 = "B";
		}
		
		else if ( avg >= 70 ) {
			str1 = "C";
		}
		
		else if ( avg >= 60 ) {
			str1 = "D";
		}
		
		else {
			str1 = "F";
			System.out.println("해당 학생은 낙제입니다\n");
		}
		
				
		System.out.println("해당 학생의 학점은 " + str1 + " 등급");
	}

}
