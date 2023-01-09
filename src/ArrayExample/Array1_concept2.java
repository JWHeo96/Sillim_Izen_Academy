package ArrayExample;

import java.util.Arrays;
import java.util.Random;

public class Array1_concept2 {

	public static void main(String[] args) {
		/* 
		 * 난수를 발생하여 로또 복권을 추첨합니다.
		 * 중복을 제거하여 로또를 출력해 보세요.
		 */
		
		Random lotto = new Random(); 
		int lottos[] = new int[6];
		for(int i=0; i<lottos.length; i++) {
			lottos[i] = lotto.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lottos[i] == lottos[j]) {
					i--;
				}
			}
			System.out.println((i+1) +"번 숫자:" + lottos[i]);
		}
		System.out.println(Arrays.toString(lottos));
		
		
		
	} // main end

} // class end
