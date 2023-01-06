package Repeat;

public class forSample1_numericType {

	public static void main(String[] args) {
		// 문제> 1 ~ 100 사이의 정수의 합계를 구하여 출력하세요.
		
		int i, sum =0;
		System.out.println("=====for문=====");
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합계는 " + sum);
		
		// while문으로 변경
		i=0; sum=0;
		System.out.println("\n=====while문=====");
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("1부터 100까지의 합계는 " + sum);
		
		// do ~ while문으로 변경
		i=0; sum=0;
		System.out.println("\n=====do ~ while문=====");
		do {
			sum+=i;
			i++;
		} while(i<=100);
		System.out.println("1부터 100까지의 합계는 " + sum);
	}
}
