package Condition;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복 횟수 입력: ");
		int n = sc.nextInt();
		int data[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println((i+1) + "번 째 값 입력");
			data[i] = sc.nextInt();
		}
		
		int i, j, temp;
		for(i=n-1; i>0; i--) {
			for(j=0; j<i; j++) {
				if(data[j]<data[j+1]) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
		for(i=0; i<n; i++) {
			System.out.println(data[i]) ;
		}
	}
}


