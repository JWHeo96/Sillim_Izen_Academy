/*
 * 데이터 자료형
 * 정수형: byte(-128~127), short(-32000~32000), int(-21억~21억), long
 * 실수형: float(8byte, 단정도 실수ㅜ형: 소수점 이하 6자리정도 인정), 
 * double(16byte, 배정도 실수형, 15자리정도 인정), 지수형: Exponent,(가수부, 지수부)
 * 정밀도가 아주 높다.
 * 그러나 오차가 발생 합니다. 
 */

public class Sample3_dataType5 {

	public static void main(String[] args) {
		
		float a = 2122000000000000000f;
		float b = 300000000f;
		//int sum = a + b; //묵시적 형변환, -1872967296
		float sum = a + b; // a=int,, b=int, (byte) => 강제적 형변환
		System.out.println(sum); // 2.12199999E18
		// 2.12199999E18 => 2121999990000000000.0
		
		double c = 2.12199999E99;
		System.out.println(c);
		
		double d = 234.45678;
		System.out.printf("%5.3f", d);
		
		
	}
}

// byte > short > int > long > float > double
