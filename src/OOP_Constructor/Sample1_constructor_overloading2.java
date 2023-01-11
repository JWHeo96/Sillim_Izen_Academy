package OOP_Constructor;

import java.util.Scanner;

// 생성자 오버로딩이란?
// 메소드 이름은 같으나, 매개변수 숫자가 다르거나, 자료형이 다르면
public class Sample1_constructor_overloading2 {
	
	// 필드(Field)
	static Scanner sc = new Scanner(System.in);
	private static int result; //0 => 300
	private static double add;
	
	// 생성자(Constructor)
	//							 300,  5
	
	public Sample1_constructor_overloading2() { //생성자 메소드
	}
	public Sample1_constructor_overloading2(float x, int y) { //생성자 메소드
		this.result = (int)(x+y);	// 300
	}
	public Sample1_constructor_overloading2(int x, double y) {
		this.result = (int)(x-y);	// 5
	}
	public Sample1_constructor_overloading2(double x, int y) {
		this.result = (int)(x*y);	// 5
	}
	public Sample1_constructor_overloading2(double x, double y) { //생성자 메소드
		this.result = (int)(x/y);	// 5
	}
	public Sample1_constructor_overloading2(int x, int y) { //생성자 메소드
		this.result = (int)(x%y);	// 5
	}
	public int getResult() {
		return result;
	}
	

	
	// 메소드(Method)
	private static int xInput() {
		System.out.println("첫 번째 숫자를 입력하세요.");
		int x = sc.nextInt(); // 홍길동
		return x;
	}
	private static int yInput() {
		System.out.println("두 번째 숫자를 입력하세요.");
		int y = sc.nextInt(); // 50
		return y;
	}

	
	// Main Area
	public static void main(String[] args) {
		// 두 수를 입력 받아서, 생성자 오버로딩을 이용하여 가감승제산을 하고 그 결과를 출력해보세요.
		int x = xInput(); // x => 300
		int y = yInput(); // y => 5
		
//		//												 






		System.out.println("원하는 연산을 선택해주세요.");
		System.out.println("1.덧셈\t2.뺄셈\t3.곱셈\n4.나눗셈(몫)\t5나눗셈(나머지)");
		int oper = sc.nextInt();
		System.out.printf("\n결과: ");
		switch(oper) {
			case 1: 
				Sample1_constructor_overloading2 scon1 = new Sample1_constructor_overloading2((float)x, y);
				System.out.println(scon1.getResult()); break;
			case 2: 
				Sample1_constructor_overloading2 scon2 = new Sample1_constructor_overloading2(x, (double)y);
				System.out.println(scon2.getResult()); break;
			case 3: 
				Sample1_constructor_overloading2 scon3 = new Sample1_constructor_overloading2((double)x, y);
				System.out.println(scon3.getResult()); break;
			case 4: 
				Sample1_constructor_overloading2 scon4 = new Sample1_constructor_overloading2((double)x, (double)y);
				System.out.println(scon4.getResult()); break;
			case 5: 
				Sample1_constructor_overloading2 scon5 = new Sample1_constructor_overloading2(x, y);
				System.out.println(scon5.getResult()); break;
		}	

	}
}
