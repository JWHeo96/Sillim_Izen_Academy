package oracleDBTest3;

import java.util.Scanner;

public class memberInter_classMethod {

	public static void main(String[] args) {
		memberInter_classMethod micm = new memberInter_classMethod();
		boolean stop = true;
		
		while(stop) {
			System.out.println("--------------------------");
			System.out.println("*** menu selection ***");
			System.out.println("1.회원정보 입력");
			System.out.println("2.회원정보 수정");
			System.out.println("3.회원정보 삭제");
			System.out.println("4.회원정보 조회");
			System.out.println("5.시스템 종료");
			System.out.println("--------------------------");
			
			memberDBConnectTest mct = new memberDBConnectTest();
			mct.memberDBConnect();
			
			Scanner sc = new Scanner(System.in);
			String x = sc.next();
			
			switch(x) {
				case "1": memberInsertTest mit = new memberInsertTest();
					mit.memberInsert(); break;
				case "2": memberUpdateTest mut = new memberUpdateTest();
					mut.memberUpdate(); break;
				case "3": memberDeleteTest mdt = new memberDeleteTest();
					mdt.memberDelete(); break;
				case "4": memberSelectTest mst = new memberSelectTest();
					mst.memberSelect(); break;
				case "5": stop = false; 
			}
		}
	}

}
