import java.util.Scanner;

/* 산술 연산자: 5가지, +, -, *, /(몫), %(나머지)
 * 관계 연산자: 6가지, ==, !=, <, <=, >, >=
 * 논리 연산자: and, or, not, nand, nor, xor
 * 플립플롭 회로: D, T,  TK.....
 * 설계도(회로도) 그리기
 * 부품 회로 완성
 * 직접 만들기
 */
public class Sample4_operator2 { // 3000번지 가정.

	public static void main(String[] args) { // 3200번지
		//Arithmetic Operation 
		//System.out: 표준 출력을 화면으로 하세요.
		//System.in: 표준 입력을 키보드로부터 입력 하세요.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("x 값을 입력하세요.");
//		int x = sc.nextInt();
//		System.out.println("y 값을 입력하세요.");
//		int y = sc.nextInt();
//		
//		int sum = x + y;
//		short sum2 = (short)(x - y);
//		int sum3 = x * y;
//		float sum4 = x / y;
//		double sum5 = x % y;
//		
//		System.out.println("덧셈: " + sum);		
//		System.out.println("밸셈: " + sum2);		
//		System.out.println("곱셈: " + sum3);		
//		System.out.println("나눗셈(몫): " + sum4);		
//		System.out.println("나눗셈(나머지): " + sum5);
//		
//		// 관계 연산자: 결과는 참, 거짓으로 나옵니다.
//		int xx = x; // 100
//		int yy = y; // 20
//		
//		
//		System.out.println(xx > yy); // Boolean값으로 결과가 나온다. true
//		System.out.println(xx >= yy); // true
//		System.out.println(xx < yy); // false
//		System.out.println(xx <= yy); // false
//		System.out.println(xx == yy); // false
//		System.out.println(xx != yy); // true
//		System.out.println("====================================");
		
		// 논리 연산자
		boolean a = true, b = false;
		/* ab	and(&&) or(||) not(!)
		 * --------------------------------
		 * 00	0		0		0 => 1
		 * 01	0		1		1 => 0
		 * 10	0		1	
		 * 11	1		1		
		 */
		System.out.println("1. a = true, b = false\n");
		System.out.println("a&&b = " + (a&&b)); // false
		System.out.println("a||b = " + (a||b)); // true
		System.out.println("!a = " + !a); // false
		System.out.println("!b = " + !b); // true
		System.out.println("------------------");
		
		boolean a2 = true, b2 = true;
		System.out.println("2. a2 = true, b2 = true\n");
		System.out.println("a2&&b2 = " + (a2&&b2)); // true
		System.out.println("a2||b2 = " + (a2||b2)); // true
		System.out.println("!a2 = " + !a2); // false
		System.out.println("!b2 = " + !b2); // false
		System.out.println("------------------");
		
		boolean a3 = false, b3 = true;
		System.out.println("3. a3 = false, b3 = true\n");
		System.out.println("a3&&b3 = " + (a3&&b3)); // false
		System.out.println("a3||b3 = " + (a3||b3)); // true
		System.out.println("!a3 = " + !a3); // true
		System.out.println("!b3 = " + !b3); // false
		System.out.println("------------------");
		
		boolean a4 = false, b4 = false;
		System.out.println("4. a4 = false, b4 = false\n");
		System.out.println("a4&&b4 = " + (a4&&b4)); // false
		System.out.println("a4||b4 = " + (a4||b4)); // false
		System.out.println("!a4 = " + !a4); // true
		System.out.println("!b4 = " + !b4); // true
		System.out.println("------------------");
		
	}
}
