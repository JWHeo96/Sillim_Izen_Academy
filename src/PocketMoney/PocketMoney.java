package PocketMoney;

import java.util.Scanner;

public class PocketMoney {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아빠 용돈: ");
		int dad = sc.nextInt();
		System.out.print("엄마 용돈: ");
		int mom = sc.nextInt();
		
		Overr_Calc md = new Overr_Calc(dad, mom);
		md.output();
	}
}
