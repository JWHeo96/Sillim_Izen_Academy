package OOP_Inheritance;

import java.util.Scanner;

/* 상속이란?
 * 기존에 작성된 부모 클래스로부터 자식 클래스에게 속성과 기능을 물려 받는 것.
 * - 속성: 클래스 변수
 * - 행위: 클래스 메소드
 * - 생성자는 상속이 안됩니다.
 * - 접근제한자가 같은 패키지인 경우에 생략이 가능합니다.
 * - 다른 패키지라면 반드시 public을 해주어야 합니다.
 * - 단일 상속만 허용합니다.
 * - 다중 상속의 효과를 이용하여 다중 상속처럼 처리합니다.
 * - 종류
 * 1. public class A extends B { ..... } : 클래스끼리 상속 할 경우 
 * 2. public interface A implements B { ..... } : 인터페이스끼리 상속 할 경우
 * 3. public class A extends B implements C, D, E ... { ..... } : 클래스와 인터페이스를 상속 할 경우
 * 4. public class A  implements B, C,, D ..... { ..... } : 인터페이스가 여러개를 상속 할 경우
 * - 상위 클래스에 속하는 내용을 참조하려면 super() 을 이용합니다.
 * 
 */

class Age { // parent class
	
	public static int age() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		
		return age;
	}
}

public class Sample1_Inheritance extends Age {

	public static void main(String[] args) {
		// 문제 > 이름과 나이를 입력 받아서, 상속을 이용하여 처리하고 출력해 보세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		
		int age = age();
				
		System.out.println(name + "님의 나이는 " + age + "입니다."); // 이름 출력
	}
}
