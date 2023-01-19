package ConvenienceStore;

import java.util.Scanner;

public class CS_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력해주세요.");
		String userid = sc.next();
		System.out.println("PWD를 입력해주세요.");
		String userpwd = sc.next();
		
		RegistMember rm = new RegistMember();
		rm.RegistMemb(userid, userpwd);
	}
}
