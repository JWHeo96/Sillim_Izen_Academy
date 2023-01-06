/* 산술 연산자: 5가지, +, -, *, /(몫), %(나머지)
 * 관계 연산자: 6가지, ==, !=, <, <=, >, >=
 * 논리 연산자: and, or, not, nand, nor, xor
 * 플립플롭 회로: D, T,  TK.....
 * 설계도(회로도) 그리기
 * 부품 회로 완성
 * 직접 만들기
 */
public class Sample4_operator { // 3000번지 가정.

	public static void main(String[] args) { // 3200번지
		//Arithmetic Operation 
		int x = 100, y = 20; // x= 3210번지, y= 3220번지
		
		int sum = x + y;
		System.out.println("덧셈: " + sum); //120
		
		short x2 = 100, y2 = 20; // x2= 3310번지, y2= 3320번지
		short sum2 = (short) (x2 - y2);
		System.out.println("뺄셈: " + sum2); //80
		
		float x3 = 123.45f, y3 = 20.123f;
		float sum3 = x3 * y3;
		System.out.println("곱셈: " + sum3); //2484.184
		
		double x4 = 123.45, y4 = 22.34;
		double sum4 = x4 / y4;
		System.out.printf("나눗셈(몫): %4.3f\n", sum4);  // 5.526
		
		double x5 = 123.45, y5 = 22.34;
		double sum5 = x5 % y5;
		System.out.printf("나눗셈(나머지): %4.3f", sum5);  // 5.526

	}
}
