

import java.util.Scanner;

/*
 * 문제> 실수형 두 수를 입력받아서, 가감승제산을 출력하세요.
 * 실수형> double, double형이 있습니다.
 */
public class Sample2_variable2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.실수형 데이터를 입력하세요.");
		/* int : 정수형으로, 자료형이라 불립니다. 
		 * x : x라는 변수에 저장
		 * int => Integer의 약어.
		 */
		
		
		double x = sc.nextDouble();	// 객체명.메소드명 공식
		System.out.println("2.실수형 데이터를 입력하세요.");
		double y = sc.nextDouble();
		
		double sum = x + y;
		double sum2 = x - y;
		double sum3 = x * y;
		double sum4 = x / y;
		
		System.out.println("덧셈 합계 : " + sum );
		System.out.println("뺄셈 합계 : " + sum2 );
		System.out.println("곱셈 합계 : " + sum3 );
		System.out.println("나눗셈(몫) 합계 : " + sum4);
		

	}
}
