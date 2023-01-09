package ArrayExample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array1_concept2 {

	public static void main(String[] args) {
		/* 
		 * 난수를 발생하여 로또 복권을 추첨합니다.
		 * 중복을 제거하여 로또를 출력해 보세요.
		 */
		boolean sw = true;

		while(sw) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("로또 자리수를 입력해주세요.");
			int n = sc.nextInt();
			System.out.println("반복 횟수를 입력해주세요.");
			int m = sc.nextInt();
			
			Random lotto = new Random(); 
			int lottos[] = new int[n];
			
			for(int x=0; x<m; x++) {
				for(int i=0; i<lottos.length; i++) {
					lottos[i] = lotto.nextInt(45)+1;
					for(int j=0; j<i; j++) {
						if(lottos[i] == lottos[j]) {
							i--;
						}
					}
				}
				Arrays.sort(lottos);
				System.out.println(Arrays.toString(lottos));
			}

			
			if(sw) {
				System.out.println("\n난수를 계속 생성하겠습니까?(y/n)");
				String str = sc.next();
				if(str.equals("y")) {
					continue;
				} else {
					sw=false;
				}
			}
		}
	} // main end
} // class end
