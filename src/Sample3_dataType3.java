/*
 * 데이터 자료형
 * 정수형: byte(-128~127), short(-32000~32000), int(-21억~21억), long
 * 실수형: float, double, 지수형: Exponent,(가수부, 지수부) 
 */

public class Sample3_dataType3 {

	public static void main(String[] args) {
		
		int a = 2122000000;
		int b = 300000000;
		//int sum = a + b; //묵시적 형변환, -1872967296
		byte sum = (byte) (a + b); // a=int,, b=int, (byte) => 강제적 형변환
		System.out.println(sum); // -1872967296
		
	}
}
