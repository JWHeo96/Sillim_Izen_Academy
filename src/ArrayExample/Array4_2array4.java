package ArrayExample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array4_2array4 {

	public static void main(String[] args) {
	/* 2차원 배열 : [][] 행, 열
	 * int[][] score = new int[][];
	 * index는 (0,0)부터 시작
	 * 
	 * 최저 5명의 학생 이름과 국/영/수 점수를 입력 받아 총점, 평균, 학점, 석차를 구해 출력하시오.
	 * 내림차순 정렬
	 */
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		int n = 5;	//학생수
		int total[] = new int[5];
		double avg[] = new double[5];
		char grade[] = new char[5];
		int rank[] = new int[n];
		Object[][] score = new Object[n][5];
		
		System.out.println("학생들의 이름과 과목별 점수를 입력해주세요.");
		
		for(i=0; i<n; i++) {
			System.out.print((i+1) + ". Name : ");
			score[i][0] = sc.next();
			System.out.print("- Kor : ");
			score[i][1] = Integer.parseInt(sc.next());
			System.out.print("- Eng : ");
			score[i][2] = Integer.parseInt(sc.next());
			System.out.print("- Math : ");
			score[i][3] = Integer.parseInt(sc.next());
		}
		
		System.out.println("=============================================================");
		System.out.println("Name\tKor\tEng\tMath\tTot\tAvg\tGrd\tRnk");
		System.out.println("=============================================================");
		
		for(i=0; i<n; i++) {
			total[i] = (int)score[i][1] + (int)score[i][2] + (int)score[i][3];
			avg[i] = total[i]/3;
			
			if(avg[i]>=90 && avg[i]<=100) 
				grade[i] = 'A';
				else if (avg[i]>=80 && avg[i]<90) 
					grade[i] = 'B';
					else if (avg[i]>=70 && avg[i]<80) 
						grade[i] = 'C';
						else if (avg[i]>=60 && avg[i]<70) 
							grade[i] = 'D';
							else
								grade[i] = 'F';

			}

		/* for (i=0; i<n; i++) { 
		 * 	rank[i] = 1; 
		 * }
		 */
		
		for (i=0; i<n; i++) {
            double standard_score = avg[i];//기준학생점수
           
            for (j=i; j<n; j++) {
                double compare_score = avg[j];//비교학생점수

                if (standard_score < compare_score) {
                	rank[i]++;
                	} else if (standard_score > compare_score) {
                		rank[j]++;
                		}
                }
            }
	
		Arrays.sort(rank);
		for(i=0; i<5; i++) {
			System.out.print(score[i][0] + "\t" + score[i][1] + "\t" + score[i][2] + "\t" + score[i][3]);
			System.out.print("\t" + total[i] + "\t" + avg[i] + "\t" + grade[i]  + "\t" + rank[i] + "\n");
		}
		
		
		
	}
       
}