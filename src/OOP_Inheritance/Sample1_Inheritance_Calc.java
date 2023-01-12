package OOP_Inheritance;

import java.util.Scanner;

public class Sample1_Inheritance_Calc implements Interface_Calculator {
	
	int result = 0;
	
	@Override
	public int sum(int x, int y) {
		result = x + y;
		return result;
	}

	@Override
	public int dif(int x, int y) {
		result = x - y;
		return result;
	}

	@Override
	public int multi(int x, int y) {
		result = x * y;
		return result;
	}

	@Override
	public int div(int x, int y) {
		result = x / y;
		return result;
	}

	@Override
	public int remain(int x, int y) {
		result = x % y;
		return result;
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("두 번째 수를 입력해주세요.");
		int y = sc.nextInt();
	
		Sample1_Inheritance_Calc calc = new Sample1_Inheritance_Calc();
		System.out.println(x + " + " + y + " = "  + calc.sum(x, y));
		System.out.println(x + " - " + y + " = "  + calc.dif(x, y));
		System.out.println(x + " * " + y + " = "  + calc.multi(x, y));
		System.out.println(x + " / " + y + " = "  + calc.div(x, y));
		System.out.println(x + " % " + y + " = "  + calc.remain(x, y));
		
	}


}
