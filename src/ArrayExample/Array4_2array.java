package ArrayExample;

import java.util.Arrays;

public class Array4_2array {

	public static void main(String[] args) {
	/* 2차원 배열: 행, 열
	 * 
	 * int [][]score = new int[][];
	 * index는 (0,0)부터 시작 합니다.
	 */
		//	4행 3열

		int[][] score = new int[][] { 
				{70,80,90},
				{60,70,80},
				{50,60,70},
				{40,50,60},
		};
		
		System.out.println("----------------------");
		System.out.println("번호 자바 JSP Spring 총점");
		System.out.println("----------------------");
		
		for(int i=0; i<score.length; i++) {
			int total = 0;
			System.out.print((i+1) + ": ");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + " ");
				total += score[i][j];
			}
			System.out.println("\t총점: " + total);
		}

	}
}
