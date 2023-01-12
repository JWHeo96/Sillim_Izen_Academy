package Calculator;

import java.util.Scanner;

public class Sample1_Inheritance_Calc extends Calculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("두 번째 수를 입력해주세요.");
		int y = sc.nextInt();
		

		Calculator calc = new Calculator();
		calc.add(x, y);
		System.out.println(x + " + " + y + " = "  + result);
		calc.sub(x, y);
		System.out.println(x + " - " + y + " = "  + result);
		calc.mul(x, y);
		System.out.println(x + " * " + y + " = "  + result);
		calc.div(x, y);
		System.out.println(x + " / " + y + " = "  + result);
		calc.rem(x, y);
		System.out.println(x + " % " + y + " = "  + result);
		
	}


}
