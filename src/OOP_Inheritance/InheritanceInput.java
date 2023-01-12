package OOP_Inheritance;

import java.util.Scanner;

public class InheritanceInput implements inputInterface {
	
	@Override
	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("데이터 입력: ");
		int x = sc.nextInt();
		return x;
	}


}
