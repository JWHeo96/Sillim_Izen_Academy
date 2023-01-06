package ArrayExample;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//복습
		//배열에 사용할 임의의 데이터를 n개 입력하여 그 배열의 데이터의 
		// 합계와 평균을 구하여 출력해 봅니다.n
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 데이터 수를 지정해주세요.");
		int n = sc.nextInt();
		
		double score[] = new double[n];
		double result = 0;
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1) + "번 째 점수를 입력해주세요.");
			score[i] = sc.nextInt();
			result += score[i];
		}
		double avg = result / score.length;
		System.out.println("점수의 합계는 " + result +"점이고, 평균은 " + avg + "점 입니다");
		
		
	}
}
