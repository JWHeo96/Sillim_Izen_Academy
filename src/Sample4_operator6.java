public class Sample4_operator6 {
	
	public static void main(String[] args) {
		// 증가(+1) 감소(-1) 연산자
		/*
		 * 대입후 연산: y--
		 * 연산후 대입: ++y
		 * 연산의 우선순위: ( )	
		 */
		
		int x = 10, y =30;
		
		//   41    11      30(29 기억)
		int sum = (++x) + (y--); // 11 + 30 = 41, 결과가 실행 된 후 y의 값이 1 감소
		System.out.println(sum); /// 41
		
		x++; // 12
		System.out.println(x); // 12
		
		++x; // 13
		System.out.println(x); // 13
		
		// y의 기억된 29값이 출력됨
		System.out.println(y); // 29
		System.out.println("===========================================");
		
	 //문제>
	 int xx=0, yy=10, zz=50, sum1, sum2;
		
		xx++; //0
		System.out.println("1. xx++ : " +  xx); //1
		
		xx--; //1
		System.out.println("2. xx-- : " +  xx); //0
		
		++xx; //1
		System.out.println("3. ++xx : " +  xx); //1
		
		sum1 = xx + (++yy) - (zz--); // 1+11-50 = -38
		System.out.println("4. sum1 = xx + (++yy) - (zz--) : " + sum1); //-38 , (y=11, z=49)
		
		sum2 = (sum1++) - yy; // -38 - 11 = -48
		System.out.println("5. sum2 = (sum1++) - yy : " + sum2); //-49
		
		zz--; //49
		System.out.println("6. zz-- : " + zz); //48
		
	}
}

