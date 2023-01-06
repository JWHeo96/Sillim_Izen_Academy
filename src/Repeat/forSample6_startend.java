package Repeat;

import java.util.Scanner;

public class forSample6_startend {

	public static void main(String[] args) {
		//문제> 시작 숫자를 입력하고, 끝나는 숫자를 입력하여 누적된 합계를 구하여 출력하세요.
		
		// default : 시작 숫자, 끝 숫자 입력
		Scanner sc =new Scanner(System.in);
		int[] start = new int[3];
		int[] end = new int [3];
		int i=0, sum=0;
		for(i=0;i<3;i++) {
			System.out.println(i + "번째 시작값 입력");
			start[i] = sc.nextInt();
			System.out.println(i + "번째 종료값 입력");
			end[i] = sc.nextInt();
		}
		
		
		// 1.for
		for(i = start[0]; i <= end[0]; i++) {
			sum += i;
		}
		System.out.println("==========for문==========");
		System.out.println(start[0] + "부터 " + end[0] + "까지의 합계는 " + sum + "입니다.\n");	
		
		// 2.while
		i = 0; sum =0;
		int startPoint = start[1];
		
		while(start[1]<=end[1]) {
			sum+=start[1];
			start[1]++;
		}
		System.out.println("\n==========while문==========");
		System.out.println(startPoint + "부터 " + end[1] + "까지의 합계는 " + sum + "입니다.\n");
		
		// 3.do~while
		i = 0; sum =0;
		int startPoint2 = start[2];
		
		do {
			sum+=start[2];
			start[2]++;
		} while(start[2]<=end[2]);
		System.out.println("\n==========do~while문==========");
		System.out.println(startPoint2 + "부터 " + end[2] + "까지의 합계는 " + sum + "입니다.\n");
	}
}

