/*
 * 데이터 자료형
 * 정수형: byte, short, int, long
 * 실수형: float, double, 지수형: Exponent,(가수부, 지수부) 
 */

public class Sample3_dataType {

	public static void main(String[] args) {
		
		byte a = 126;
		byte b = 3;
		// int sum = a + b; 묵시적 형변환, 129 
		byte sum = (byte) (a + b); // a=int,, b=int, (byte) => 강제적 형변환
		System.out.println(sum); // -127
		
	}
}
