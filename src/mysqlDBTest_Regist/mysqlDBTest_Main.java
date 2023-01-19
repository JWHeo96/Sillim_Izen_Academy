package mysqlDBTest_Regist;
import java.util.Scanner;

import mysqlDBTest_Regist.Classes.*;

public class mysqlDBTest_Main {

	public static void main(String[] args) {
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
			
			registerDBConnectTest mct = new registerDBConnectTest();
			mct.registerDBConnect();
			
			Scanner sc = new Scanner(System.in);
			String x = sc.next();
			
			switch(x) {
				case "1": registerInsertTest mit = new registerInsertTest();
					mit.registerInsert(); break;
				case "2": registerUpdateTest mut = new registerUpdateTest();
					mut.registerUpdate(); break;
				case "3": registerDeleteTest mdt = new registerDeleteTest();
					mdt.registerDelete(); break;
				case "4": registerSelectTest mst = new registerSelectTest();
					mst.registerSelect(); break;
				case "5": stop = false; 
			}
		}
	}
}
