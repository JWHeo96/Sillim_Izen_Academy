package Repeat;

public class forSample4_oddeven {

	public static void main(String[] args) {
		// 문제> 1~100 사이의 숫자 중에서 홀수의 합계를 구하여 출력하세요.
		int i, sum = 0;
		
		// 방법 1.
		for(i=1; i<=100; i++) {
			if(!(i%2 == 0)) {
				sum+=i;
			}
		}
		System.out.println("1부터 100까지의 홀수의 합계는 " + sum + "입니다.");
		
		// 방법 2.
		// continue: 건너뛰기, skip, 다음으로 ...
		System.out.println("------continue의 결과------");
		sum = 0;
		for(i=1; i<=100; i++) {
			if(i%2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지의 홀수의 합계는 " + sum + "입니다.");

	} // main end
} // class end
