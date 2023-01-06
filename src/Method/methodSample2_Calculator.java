package Method;

import java.util.Scanner;

// 문제> 두 수를 입력 받아서, 가감승제산 5가지(+, -, *, /, %)를 하여 출력하세요.
 /* 입력: inputX(), x, inputY(), y
 * 덧셈: adder(), 전달인자 변수(x, y), 매개변수(x1, y1), 반환값(sum1)
 * 뺄셈: suber(), 전달인자 변수(x, y), 매개변수(x2, y2), 반환값(sum2)
 * 곱셈: muler(), 전달인자 변수(x, y), 매개변수(x3, y3), 반환값(sum3)
 * 나눗셈(몫): diver(), 전달인자 변수(x, y), 매개변수(x4, y4), 반환값(sum4)
 * 나눗셈(나머지): diver2(), 전달인자 변수(x, y), 매개변수(x5, y5), 반환값(sum5)
 * 
 * 프로그래밍 단게
 * 1. 요구사항 확인
 * 2. 애플리케이션 분석
 * 3. 애플리케이션 설계
 * 4. 애플리케이션 구현(coding)
 * 5. 애플리케이션 테스트
 * 6. 검수
 * 7. 애플리케이션 배포 : SI
 * 8. 애플리케이션 유지보수 : SM
 * 
 */
public class methodSample2_Calculator {
	public static int InputX() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 데이터를 입력하세요.");
		int x = sc.nextInt();
		return x;
	}
	public static int InputY() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 번째 데이터를 입력하세요.");
		int y = sc.nextInt();
		return y;
	}

	private static void mok(int x, int y) {
		int result = x % y;
		System.out.println("x % y = " + result);
	}

	private static double div(double x, double y) {
		double result = x / y;
		return result;
	}

	private static double multi(double x, double y) {
		double result = x * y;
		return result;
	}

	private static void sub(int x, int y) {
		int result = x - y;
		System.out.println("x - y = " + result);
	}

	private static void add(int x, int y) {
		int result = x + y;
		System.out.println("x + y = " + result);
	}
	
	public static double calc(int x, int y, int z) {
		// 0: +, 1: -, 2: *, 3: /, 4: %
		double result = 0;
		switch(z) {
		case 0: result = (x + y); break;
		case 1: result = (x - y); break;
		case 2: result = (x * y); break;
		case 3: result = (x / y); break;
		case 4: result = (x % y); break;
		}
		return result;
	}

	public static void main(String[] args) {
		// 문제> 두 수를 입력 받아서, 가감승제산 5가지를 하여 출력하세요.
		
		
		int x = InputX();
		int y = InputY();
		
		System.out.println("0: +, 1: -, 2: *, 3: /, 4: % \n 중 선택해주세요.");
		Scanner sc = new Scanner(System.in);
		
		
		add(x, y);
		sub(x, y);
		mok(x, y);
		System.out.println("x * y = " + multi(x,y));
		System.out.println("x / y = " + div(x,y));
		
	}

}
