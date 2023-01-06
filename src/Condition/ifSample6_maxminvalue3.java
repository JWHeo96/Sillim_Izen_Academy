package Condition;

import java.util.Scanner;

public class ifSample6_maxminvalue3 {

	public static void main(String[] args) {
		
		// 3개의 수를 입력 받아 최소값, 최대값 구하기
		
		// 3개의 임의의 수 입력
		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println((i+1) + "번 째 수 입력:");
			num[i] = sc.nextInt();
		}
		
		int max = (num[0]>num[1] && num[0]>num[2]) ? num[0] :
					(num[1]>num[0] && num[1]>num[2]) ? num[1] : num[2];
		int min = (num[0]<num[1] && num[0]<num[2]) ? num[0] :
					(num[1]<num[0] && num[1]<num[2]) ? num[1] : num[2];
		
		System.out.println("최대값 : " + max + "\n최소값 : " + min);
		
	}
}
