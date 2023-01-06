package Repeat;

public class forSample5_overValue {

	public static void main(String[] args) {
		// 문제> 1부터 시작하여 합계가 3000이 넘는 순간에 값이 얼마인지를 구하여 출력하세요.
		
		System.out.println("=============for문=============");
		int i, sum = 0;
		for(i=1; i<100; i++) {
			sum+=i;
			if(sum>3000) break;
		}
		System.out.println("1부터 " + i + "까지의 합계는 " + sum + "입니다.");
		
		// 방법2. while문
		System.out.println("\n=============while문=============");
		i=0;
		sum=0;
		while(sum<=3000) {
			i++;
			sum+=i;
		}
		System.out.println("1부터 " + i + "까지의 합계는 " + sum + "입니다.");
		
		// 방법3. do~while문
		System.out.println("\n=============do ~ while문=============");
		i=0;
		sum=0;
		do {
			i++;
			sum+=i;
		} while(sum<=3000);
		System.out.println("1부터 " + i + "까지의 합계는 " + sum + "입니다.");
	}
}
