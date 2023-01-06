package Repeat;

import java.util.Scanner;

public class forSample9_dataType {

	public static void main(String[] args) {
		
		double d = 0.0;
		int i = 0;
		String s = null;
		boolean b = true;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("정수형을 입력해주세요.");		
		if(sc.hasNextInt())
			i = sc.nextInt();
		System.out.println("Integer: " + i);
		
		System.out.println("\n실수형을 입력해주세요.");		
		if(sc.hasNextDouble())
			d = sc.nextDouble();
		System.out.println("Double: " + d);
		
		System.out.println("\n문자형을 입력해주세요.");		
		if(sc.hasNext())
			s = sc.next();
		System.out.println("String: " + s);
		
		System.out.println("\n불리언형으로 입력해주세요.");		
		if(sc.hasNextBoolean())
			b = sc.nextBoolean();
		System.out.println("Boolean: " + b);
		
		
	}
}
