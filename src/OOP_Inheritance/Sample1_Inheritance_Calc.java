package OOP_Inheritance;

import java.util.Scanner;

public class Sample1_Inheritance_Calc extends Calculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("두 번째 수를 입력해주세요.");
		int y = sc.nextInt();
		
		Calculator calc = new Calculator();
		System.out.println(x + " + " + y + " = "  + calc.add(x, y));
		System.out.println(x + " - " + y + " = "  + calc.sub(x, y));
		System.out.println(x + " * " + y + " = "  + calc.mul(x, y));
		System.out.println(x + " / " + y + " = "  + calc.div(x, y));
		System.out.println(x + " % " + y + " = "  + calc.rem(x, y));
		
	}


}
