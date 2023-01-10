package ArrayExample;

import java.util.Scanner;

public class Array4_2array2 {

	public static void main(String[] args) {
	/* 2차원 배열: 행, 열
	 * 
	 * N명의 학생이름과 점수를 입력 받아서, 총점, 평균을 구하여 출력해 봅니다.
	 */
		//	4행 3열
		boolean sw = true;
		int total = 0;
		double avg = 0.0;
		Scanner sc = new Scanner(System.in);
		
		while(sw) {
			System.out.println("배열에 저장할 과목수를 입력하세요.");
			int n = sc.nextInt();
			String name[] = new String[n];

			double sungjukdata[][] = new double[n][5];

			for(int i=0; i<name.length; i++) {
				int sum = 0;
				System.out.println("이름");
				name[i] = sc.next();
				
				for(int j=0; j<n; j++) {
					if(j == 0) {
						System.out.println("kor:");
						sungjukdata[i][0] = sc.nextDouble();
						sum+=sungjukdata[i][j];
					}
					if(j == 1) {
						System.out.println("eng:");
						sungjukdata[i][1] = sc.nextDouble();
						sum+=sungjukdata[i][j];
					} 
					if(j == 2) {
						System.out.println("math:");
						sungjukdata[i][2] = sc.nextDouble();
						sum+=sungjukdata[i][j];
					}
					// 총점과 평균 구하기
					sungjukdata[i][3] = sum;
					avg = sum / 3.0;
					sungjukdata[i][4] = avg;
				}

			}
			System.out.println("---------------------------------");
			System.out.println("이름\t총점\t평균");
			System.out.println("---------------------------------");
			
			for(int i=0; i< name.length; i++) {
				System.out.println(name[i] + "\t" + sungjukdata[i][3] + "\t" + sungjukdata[i][4]);
			}
	
			System.out.println("성적 데이터를 계속 처리하겠습니까? (yes/no)");
			String str = sc.next();
			if(str.equals("yes")) {
				continue;
			} else {
				System.exit(0);
				break;
			}
		
		}

	}
		
	}
