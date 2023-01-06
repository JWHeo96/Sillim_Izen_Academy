package Condition;

import java.util.Scanner;

public class ifSample1 {

	public static void main(String[] args) {
		
	// 임의의 수를 홀수인지, 짝수인지 판별하여 출력하세요.	
		int su = 100;
		
		if((su%2) == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		
	// 데이터를 임의적으로 입력하여 테스트하려면, 스캐너 클래스를 이용 합니다.
		Scanner sc = new Scanner(System.in);
		String x = sc.next(); // 문자열 데이터 입력이 가능
		// 문자는 연산에 참여가 불가합니다.
		int y = sc.nextInt();
		
		// 정수형 변환하는 부분
		int xx = Integer.parseInt(x); // 클래스명.클래스 메소드명 
		//double xx = Double.parseDouble(x);
		
		int sum = xx + y;
		System.out.println(sum);
		
		if((sum%2) == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
	}
}
