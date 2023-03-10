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
 * 2. public interface A implements B, C, D, E .... { ..... } : 인터페이스끼리 상속 할 경우
 * 3. public class A extends B implements C, D, E ... { ..... } : 클래스와 인터페이스를 상속 할 경우
 * 4. public class A  implements B, C, D ..... { ..... } : 인터페이스가 여러개를 상속 할 경우
 * - 상위 클래스에 속하는 내용을 참조하려면 super() 을 이용합니다.
 * 
 * interface란?
 * - 프로젝트를 진행하다가 현재(당장)에는 필요하지 않지만, 앞으로 이러한 기능이 필요하고,
 *  사용되어질 것을 예측하여 미리 작성해 둔 소스코드 파일 입니다.
 * - public abstract void name();
 * - 인터페이스는 바디(BODY)가 존재하지 않습ㅂ니다. => {     }
 * - 반드시 메소드 오버라이딩을 하여 사용합니다. (@Override)
 * - interface는 객체를 생성하지 못합니다.
 *  그래서, 반드시 클래스에게 상속하여 메소드 오버라이딩을 하여 처리해야 합니다.
 */


public class Sample1_Inheritance3 { // child class

	public static void main(String[] args) {
		// 문제 > 데이터를 입력받아서 가강승제산을 처리하되 상속을 이용하여 처리하고 출력해보세요.
		/* 애플리케이션 설계
		 * --------------------------------
		 * main class: Sample1_Inheritance3
		 * 
		 * sub class
		 *  1. interface: 가감승제산 5가지
		 *  - 데이터 입력: inputInterface(x, y), input()
		 *  - 덧셈 인터페이스: addInterface, public abstract void adder(int x, int y);
		 *  - 뺄셈 인터페이스: suberInterface, suber(int x, int y)
		 *  - 곱셈 인터페이스: mulerInterface, muler(int x, int y)
		 *  - 나눗셈(몫) 인터페이스: divierInterface1, divider1(int x, int y)
		 *  - 나눗셈(나머지) 인터페이스: divierInterfcae2, divider2(int x, int y)
		 *  
 		 *  2. sub class: Inheritance3
 		 *  - InheritanceAdder
 		 *  - InheritanceSuber
 		 *  - InheritanceMuler
 		 *  - InheritanceDivier
 		 *  - InheritanceDivier
 		 *  
 		 *  3. 인터페이스가 인터페이스에게 상속
 		 *  
 		 *  4. logic 작성
 		 *  
		 */
		InheritanceInput it3 = new InheritanceInput();
		int x = it3.input();
		int y = it3.input();
		
		InheritanceAdder itadd= new InheritanceAdder();
		itadd.adder(x, y);
		
		InheritanceSuber itsub= new InheritanceSuber();
		itsub.suber(x, y);
		
		InheritanceMuler itmul= new InheritanceMuler();
		itmul.muler(x, y);
		
		InheritanceDivier1 itdiv1= new InheritanceDivier1();
		itdiv1.divier1(x, y);
		
		InheritanceDivier2 itdiv2= new InheritanceDivier2();
		itdiv2.divier2(x, y);
	
	
	}


}
