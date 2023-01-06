package Method;

import java.util.Scanner;

public class methodSample2_Calculator {
	

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

	public static void main(String[] args) {
		// 문제> 두 수를 입력 받아서, 가감승제산 5가지를 하여 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요.");
		int x = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int y = sc.nextInt();
		
		
		add(x, y);
		sub(x, y);
		mok(x,y );
		System.out.println("x * y = " + multi(x,y));
		System.out.println("x / y = " + div(x,y));
		
	}

}
