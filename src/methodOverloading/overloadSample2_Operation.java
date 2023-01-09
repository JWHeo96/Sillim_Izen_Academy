package methodOverloading;

import java.util.Scanner;

public class overloadSample2_Operation {

	private static void calculator(int x, int y) {
		int sum = x + y;
		System.out.println("두 수의 합계: " + sum);
	}
	private static void calculator(int x2, double y2) {
		double sum = x2 - y2;
		System.out.println("두 수의 차이: " + sum);
	}
	private static void calculator(double x3, double y3) {
		double sum = x3 * y3;
		System.out.println("두 수의 곱하기: " + sum);
	}

	public static void main(String[] args) {
		/* 2개는 정수형 데이터 처리
		 * 2개는 실수형 데이터 처리
		 * 1개는 정수형 데이터, 1개는 실수형 데이터 처리
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수형 데이터를 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("실수형 데이터를 입력하세요.");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		System.out.println("1:정수형, 2:실수형 데이터를 입력하세요.");
		int x3 = sc.nextInt();
		double y3 = sc.nextDouble();
		
		calculator(x, y);
		calculator(x2, y2); //method overloading
		calculator(x3, y3); //method overloading
	
	}
}
