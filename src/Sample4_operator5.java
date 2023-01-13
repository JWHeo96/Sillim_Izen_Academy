public class Sample4_operator5 {
	
	public static void main(String[] args) {
		// 복합대입 연산자 : = sign에 +, -, *, /, %를 추가하여 사용합니다.
		/*
		 * int x = 100;
		 * int y = 5;
		 * int sum = x + y;
		 * System.out.println(sum); //105
		 */
		int x = 100;
		x += 5;
		System.out.println("x += 5 : " + x);
		
		x = 100;
		x -= 5;
		System.out.println("x -= 5 : " + x);
		
		x = 100;
		x *= 5;
		System.out.println("x *= 5 : " + x);	
		
		x = 100;
		x /= 5;
		System.out.println("x /= 5 : " + x);

		x = 100;
		x %= 5;
		System.out.println("x %= 5 : " + x);
	}
}

