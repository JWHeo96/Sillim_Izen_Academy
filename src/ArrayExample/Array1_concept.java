package ArrayExample;

import java.util.Scanner;

public class Array1_concept {

	public static void main(String[] args) {
		/* Array란?
		 * 차원
		 * 주소값
		 * 면, 행, 열
		 * 1차원 배열: 행과 열이 동일시 됩니다.
		 * int[] a = new int[5]; 1차원 배열의 선언
		 * 
		 * 2차원 배열 : 행(row): x축, 열(column): y축
		 * int[][] a = new int[][3]; 
		 * 
		 * 3차원 배열 : 면, 행, 열
		 * int[][][] a = new int[][][];
		 * 
		 */
		
	//배열에 사용할 임의의 데이터를 n개 입력하여 그 배열의 데이터의 
	// 합계와 평균을 구하여 출력해 봅니다.n
		double sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 데이터의 갯수를 지정해주세요.");
		int n = sc.nextInt();
		
		int scores[] = new int[n];
		System.out.println("데이터 " + n + "개를 입력해 주세요.");
		
	//반복문:   초기값;      조건식;      증가값 
		for(int i=0; i<scores.length; i++) {
			scores[i] = sc.nextInt(); 
			sum += scores[i];
		} 
		
		double avg = sum / scores.length;
		System.out.println("점수의 합계는 " + sum + " 이고,\n"
				+ "평균은 " + avg + "입니다.");
		System.out.println();
		System.out.printf("점수의 합계는 %.2f이고,\n 평균은 %.2f입니다.",sum, avg);

	}

}
