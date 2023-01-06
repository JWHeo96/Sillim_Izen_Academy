package Repeat;

import java.util.Scanner;

public class forSample7_evenOddCount {

	public static void main(String[] args) {
		
		// 문제> 시작 숫자를 입력하고, 끝나는 숫자를 입력하여 홀수의 갯수와 합을 구하여 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 값을 입력하세요.");
		int start = sc.nextInt();
		System.out.println("끝나는 값을 입력하세요.");
		int end = sc.nextInt();
		
		int i = 0, evencnt = 0, oddcnt = 0, point = start;
		int evensum = 0, oddsum = 0;
		
		for(i = start; i <=end; i++) {
			if(!(i%2 == 0)) {
				evensum+=i;
				evencnt++;
			} else {
				oddsum += i;
				oddcnt++;
			}
		}
		System.out.printf("%d부터 %d까지의 홀수의 갯수는 %d개이고, 합은 %d 입니다.\n", point, end, evencnt, evensum);
		System.out.printf("%d부터 %d까지의 짝수의 갯수는 %d개이고, 합은 %d 입니다.", point, end, oddcnt, oddsum);
	}
}
