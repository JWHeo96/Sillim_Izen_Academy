package OOP_Constructor;

import java.util.Scanner;

// 생성자 오버로딩이란?
// 메소드 이름은 같으나, 매개변수 숫자가 다르거나, 자료형이 다르면
public class Sample1_constructor_overloading {
	
	// 필드(Field)
	static Scanner sc = new Scanner(System.in);
	private static String name; //0 => 300
	private static int age; //0 => 5
	
	// 생성자(Constructor)
	//							 300,  5
	
	public Sample1_constructor_overloading(String name) { //생성자 메소드
		this.name = name;	// 300
	}
	public Sample1_constructor_overloading(int age) { //생성자 메소드
		this.age = age;	// 5
	}
	
	// 메소드(Method)
	private static String nameInput() {
		System.out.println("이름을 입력하세요.");
		String name = sc.next(); // 홍길동
		return name;
	}
	private static int ageInput() {
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt(); // 50
		return age;
	}
	private static void printNameAge() {
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "입니다.");
	}
	
	// Main Area
	public static void main(String[] args) {
		// 이름과 나이를 입력하여, 생성자 오버로딩을 이용한 저장과 그 결과를 출력해 보세요.
		String name = nameInput(); // x => 300
		int age = ageInput(); // y => 5
		
//		//												 
		Sample1_constructor_overloading scon1 = new Sample1_constructor_overloading(name);
		
		Sample1_constructor_overloading scon2 = new Sample1_constructor_overloading(age);
		
		printNameAge();
	}

}
