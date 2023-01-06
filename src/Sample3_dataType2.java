/*
 * 데이터 자료형
 * 정수형: byte(-128~127), short(-65536~65535), int, long
 * 실수형: float, double, 지수형: Exponent,(가수부, 지수부) 
 */

public class Sample3_dataType2 {

	public static void main(String[] args) {
		
		short a = 12600;
		short b = 300;
		int sum = a + b; //묵시적 형변환, 129 
		//short sum = (short) (a + b); // a=int,, b=int, (byte) => 강제적 형변환
		System.out.println(sum); // -127
		
	}
}
