package OOP_Constructor;

import java.util.Scanner;

// 생성자 메소드란?
/* 1. 클래스간에 데이터를 주고 받는데 이용합니다.
 * 2. 생성자는 상속이 되지 않습니다.
 * 3. 클래스명과 반드시 같아야 합니다.
 * 4. 반환형이 존재하지 않습니다.
 * 5. 그래서, return문을 사용하지 않습니다.
 * 6. 접근제한자는 public이거나 생략 합니다.
 * 7. 만약에 프로그래머가 생성자를 선언하지 않으면 JVM이 자동으로 만들어 줍니다.
 * 8. 즉, 생성자 메소드가 하나도 없으면 만들어 줍니다.
 * 9. default Constructor: public Sample1_constructor() { ..... }
 * 10. 목적: 클래스에서 전달하여 클래스 변수의 값을 초기화 시키는 것을 말합니다. 
 * 11. this는 생략이 가능하다.
 */
public class Sample1_constructor {
	
	// 필드(Field)
	static Scanner sc = new Scanner(System.in);
	private static int x; //0 => 300
	private static int y; //0 => 5
	
	// 생성자(Constructor)
	//							 300,  5
	public Sample1_constructor(int x, int y) { //생성자 메소드
		this.x = x;	// 300
		this.y = y;	// 5
	}
	
	// 메소드(Method)
	private static int dataInput1() {
		System.out.println("첫번째 숫자를 입력하세요.");
		int x = sc.nextInt(); // 300
		return x;
	}
	private static int dataInput2() {
		System.out.println("두번째 숫자를 입력하세요.");
		int y = sc.nextInt(); // 5
		return y;
	}
	private static void adder() {
		int sum = x + y;
		System.out.println("ADD(): " + sum); // 305
	}
	
	// Main Area
	public static void main(String[] args) {
		// 임의의 두 수를 입력 받아서, Number 클래스에 생성자를 이용하여 데이터를 전달하여 저장하고,
		// 반환하는 결과를 출력하는데, getNumber()를 이용하여 출력해보세요.
		int x = dataInput1(); // x => 300
		int y = dataInput2(); // y => 5
		
//		//												 300, 5
//		Sample1_constructor scon = new Sample1_constructor(x, y);
//		adder(); // 덧셈
		
		Number numb = new Number(x, y);
		numb.getNumber();
		
	
		
	}

}

class Number {
	static int n=0; 
	static int m=0; 
	
	public Number(int x, int y) {
		Number.n = x;
		Number.m = y;
	}
	
	public static void getNumber() {
		System.out.println("getNumber(): " + n);
		System.out.println("getNumber(): " + m);
	}


}
