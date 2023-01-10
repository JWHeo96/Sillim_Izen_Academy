package ArrayExample;

import java.util.Scanner;

public class Array4_2array3 {

	public static void main(String[] args) {
		/*
		 *  학생수는 최저 5명,
		 *  과목수는 최저 3과목,
		 *  번호, 이름, 과목1, 과목2, ... 과목n, 총점, 평균, 학점, 석차 출력
		 *  내림차순 출력
		 */
		boolean sw = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 수를 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("과목의 수를 입력해주세요.");
		int y = sc.nextInt();
		
		String[] name = new String[x];
		int[][] score = new int[x][y];
		int total[] = new int[x];
		double avg[] = new double[x];
		String grade[] = new String[x];
		int rank[] = new int[x];
		String temp;
		String subject[] = {"국어", "영어", "수학", "사회", "과학", "도덕"};
		
		while(sw) {
			for(int i=0; i<name.length; i++) {
				System.out.println("학생의 이름을 입력해주세요.");
				name[i] = sc.next();
				for(int j=0; j<y; j++) {
					System.out.println(name[i] + " 학생의 " + subject[j] +" 성적을 입력하세요.");
					score[i][j] = sc.nextInt(); 
					total[i] += score[i][j];
				}
				avg[i] = total[i]/y;
				
				if(avg[i]==100.0) {
					grade[i] ="A";
				} else if(avg[i]>100.0) {
					grade[i] ="잘못된 성적 입력입니다.";
				} else {
					switch((int)avg[i]/10) {
					case 9: grade[i] = "A"; break;
					case 8: grade[i] = "B"; break;
					case 7: grade[i] = "C"; break;
					case 6: grade[i] = "D"; break;
					default: grade[i] = "F"; break;
					}
				}
			}
			
			for(int i=0; i<name.length; i++) {
				System.out.println(name[i] + " 학생의 총점은 " + total[i] +"점이고, 평균은 " + avg[i] + "점이며, 학점은 " + grade[i] + "입니다." );
			}
			System.out.println();
			
			for(int i=0; i<name.length-1; i++) {
				for(int j=i+1;j<name.length;j++) {
					if(total[i] < total[j]) {
						temp = name[i];
						name[i] = name[j];
						name[j] = temp;
					}
				}
			}
			
			for(int i=0; i<name.length; i++) {
				System.out.println((i+1) + "등 학생: " + name[i]);
			}
			System.out.println();
			
			System.out.println("계속하시겠습니까? (y/n)");
			String conti = sc.next();
			if(conti.equals("y")) {
				continue;
			} else {
				System.exit(0);
			}
			
		}
		
		
	}
		
}
