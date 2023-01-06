

import java.util.Scanner;

/*
 * 변수 : variable : 데이터 저장 공간
 * 
 */
public class Sample2_variable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.정수형 데이터를 입력하세요.");
		/* int : 정수형으로, 자료형이라 불립니다. 
		 * x : x라는 변수에 저장
		 * int => Integer의 약어.
		 */
		
		
		int x = sc.nextInt();	// 객체명.메소드명 공식
		System.out.println("2.정수형 데이터를 입력하세요.");
		int y = sc.nextInt();
		
		int sum = x + y;
		int sum2 = x - y;
		int sum3 = x * y;
		int sum4 = x / y;

		
		System.out.println("덧셈 합계 : " + sum );
		System.out.println("뺄셈 합계 : " + sum2 );
		System.out.println("곱셈 합계 : " + sum3 );
		System.out.println("나눗셈(몫) 합계 : " + sum4 );
		

	}
}
