package Method;

import java.util.Scanner;

public class methodSample_Calc {
	
	public static double calc(double x, double y, int z) {
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
	public static String operator(int op) {
		String operator = null;
		switch(op) {
			case 0: operator = "+"; break;
			case 1: operator = "-"; break;
			case 2: operator = "*"; break;
			case 3: operator = "/"; break;
			case 4: operator = "%"; break;
		}
		return operator;
	}

	public static void main(String[] args) {
		
		// 문제> 두 수를 입력 받아서, 가감승제산 5가지를 하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 값을 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("\n두 번째 값을 입력해주세요.");
		int y = sc.nextInt();
		System.out.println("\n(연산 기호를 선택해주세요)\n"
				+ "0: +(덧셈)\t1: -(뺄셈)\t2: *(곱셈)\n3: /(나눗셈)\t4: %(몫)");
		int z = sc.nextInt();
		String op = operator(z);
			
		System.out.println("\n" + x +" "+ op +" "+ y + " = "+ calc(x, y, z));
	}
}
