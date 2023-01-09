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
		int j = 0;
		boolean sw = true;
		while(sw) {
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
			
			System.out.println("찾을 점수 데이터를 입력하세요.");
			int searchJumsu = sc.nextInt();
			for(int i=0; i < scores.length; i++) {
				if(scores[i] == searchJumsu) {
					System.out.println(scores[i] + "는 index " + i + "번에 저장되어 있습니다.");
				} else if(i == (scores.length-1)){
					System.out.println("데이터를 찾지 못했습니다.");
				}
			} 
			
			double avg = sum / scores.length;
			System.out.println("합계: " + sum + "\n" + "평균: " + avg + "\n");
			
			
			if(sw) {
				System.out.println("data continue search?(y/n)");
				String conti = sc.next();
				if(conti.equals("y")) {
					continue;
				} else {
					sw=false;
				}
			}
		} // while loop end

	} // main end

} // class end
