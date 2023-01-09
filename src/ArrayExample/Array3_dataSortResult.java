package ArrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class Array3_dataSortResult {
	/* 임의의 수를 입력 받아서, 배열에 저장하고, 내림차순으로 정렬합니다.
	 * 데이터>
	 */
	public static void main(String[] args) {
		
		// 버블정렬
		Scanner sc = new Scanner(System.in);
//		System.out.println("입력받을 데이터의 갯수를 정해주세요.");
//		int n = sc.nextInt();
//		int data[] = new int[n];
		int i=0, j=0, temp=0;
//		for(i=0; i<n; i++) {
//			System.out.println((i+1) + "번 째 데이터를 입력하세요.");
//			data[i] = sc.nextInt();
//		}
//		for(i=n-1; i>0; i--) {
//			for(j=0;j<i;j++) {
//				if(data[j]<data[j+1]) {
//					temp = data[j];
//					data[j] = data[j+1];
//					data[j+1] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(data));
//		
		
		// 그냥 정렬
		System.out.println("입력받을 데이터의 갯수를 정해주세요.");
		int n2 = sc.nextInt();
		int data2[] = new int[n2];
		for(i=0; i<data2.length; i++) {
			System.out.printf("%d번 째 데이터 입력: ", i+1);
			data2[i] = sc.nextInt();
		}
		System.out.println("정렬 전\n" + Arrays.toString(data2));
		for(i=0; i<data2.length; i++) {
			for(j=i+1; j<data2.length; j++) {
				if(data2[i] < data2[j]) {
					temp = data2[i];
					data2[i] = data2[j];
					data2[j] = temp;
				}
			}
		}
		System.out.println("정렬 후(내림차순)\n" + Arrays.toString(data2));
	}
	

}
