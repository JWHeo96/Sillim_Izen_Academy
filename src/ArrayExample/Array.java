package homeworks;

import java.util.Scanner;

public class Array {
	static String subject[] = {"����", "����", "����", "��ȸ", "����", "����"};
	
	public static void header(int repeat) {
		int i =0;
		for(i=0; i<repeat+6;i++) {
			System.out.printf("========");
		}
		System.out.printf("\n��ȣ\t�̸�\t");
		for(i=0; i<repeat; i++) {
			System.out.printf("%s\t",subject[i]);
		}
		System.out.printf("����\t���\t����\t����\n");
		for(i=0; i<repeat+6;i++) {
			System.out.printf("========");
		}
	}

	public static void main(String[] args) {
		/*
		 * �л����� ���� 5��,
		 * ������� ���� 3����,
		 * ��ȣ, �̸�, ����1, ����2, ... ����n, ����, ���, ����, ���� ���
		 * �������� ���
		 * 
		 */
		Scanner sc= new Scanner(System.in);
		int i=0; int j=0; 
		int tempScore[]; int tempInt=0; double tempDouble; String tempStr=null;
		
		while(true) {
			// �л� �� ���� �� �Է�
			System.out.println("�л� ���� �Է��ϼ���.");
			int std = sc.nextInt();
			System.out.println("���� ���� �Է��ϼ���.");
			int sub = sc.nextInt();
			
			// �Է� ���� ���� �� �迭 ����
			int rank[] = new int[std];
			int score[][] = new int[std][sub];
			int sum[] = new int[std];
			double avg[] = new double[std];
			String grade[] = new String[std];
			String name[] = new String[std];
			
			// �л��� �̸�, ���� ����, �հ�, ���, ��� ���
			for(i=0; i<name.length; i++) {
				//�л� �̸� �Է�
				System.out.println((i+1) + "��° �л��� �̸��� �Է��ϼ���.");
				name[i] = sc.next();
				// �л��� ���� ���� �Է�
				for(j=0; j<sub; j++) {
					System.out.println(name[i] + " �л��� " + subject[j] + "������ �Է��ϼ���.");
					score[i][j] = sc.nextInt();
					// �Է¹��� ������ �� �հ� ���� ���
					sum[i] += score[i][j];
				}
				// �л��� ��� ���� ���
				avg[i] = (double)sum[i]/sub;
				
				// �л��� ��������� ���� ���� ���
				// 100�� �ʰ��ÿ��� grade�� �߸��� ���� �Է�
				if(avg[i]>100.0) {grade[i] ="�߸��� ����";} 
				else {
					switch((int)avg[i]/10) {
					    case 10: case 9: grade[i] = "A"; break;
						case 8: grade[i] = "B"; break;
						case 7: grade[i] = "C"; break;
						case 6: grade[i] = "D"; break;
						default: grade[i] = "F"; break; 
					} 
				}
			}
			
			// ���� ���ϱ�
			// �յ� ���� ���Ͽ� Ŭ���� 1�� ī��Ʈ
			for(i=0; i<name.length; i++) {
				rank[i] = 1;
				for(j=0; j<name.length; j++) {
					if(sum[i] < sum[j]) {
						rank[i]++;
					}
				}
			}
			
			// ���� ���� �� ����
			// ������� 100�� �ʰ��ÿ��� �հ�� ��հ��� 0�� �Է��Ͽ� ������ ������ ����
			for(i=0; i<name.length-1; i++) {
				for(j=i+1; j<name.length; j++) {
					if(sum[i] > sum[j]) {
						{
							tempInt = sum[i];
							sum[i] = sum[j];
							sum[j] = tempInt;
						}
						{
							tempDouble = avg[i];
							avg[i] = avg[j];
							avg[j] = tempDouble;
						}
						{
							tempStr = name[i];
							name[i] = name[j];
							name[j] = tempStr;
						}
						{
							tempStr = grade[i];
							grade[i] = grade[j];
							grade[j] = tempStr;
						}
						{
							tempInt = rank[i];
							rank[i] = rank[j];
							rank[j] = tempInt;
						}
						{
							tempScore = score[i];
							score[i] = score[j];
							score[j] = tempScore;
						}
					}
				}
			}
			
				
			// ��� ���
			header(sub);
					System.out.println();
					for(i=0; i<name.length; i++) {
						System.out.printf("%d\t%s\t", i+1, name[i]);
						for(j=0; j<sub; j++) {
							System.out.printf("%s\t",score[i][j]);
						}
						System.out.printf("%d\t%.2f\t%s\t%d\n", sum[i], avg[i], grade[i], rank[i]);
					}

				// ���μ��� ���� ����
				System.out.println("\n����Ͻðڽ��ϱ�? (y/n)");
				String conti = sc.next();
				if(conti.equals("y")) {
					continue;
				} else {
					System.exit(0);
			}
		}
	
	}
}


