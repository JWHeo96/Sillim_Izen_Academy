package Library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학부모(1)\t학생(2)\n번호를 골라주세요");
		int person = sc.nextInt();
		System.out.println("지불한 금액을 적어주세요.");
		int money = sc.nextInt();
		CalcCash cc = new CalcCash(person, money);
		cc.printMoney();
		
	}
}
