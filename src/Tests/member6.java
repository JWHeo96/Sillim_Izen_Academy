package Tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

public class member6 {		
//회원 정보 '조회, 입력, 수정, 삭제' 시스템 개발
	
	private static PreparedStatement pstmt;
	private static Connection conn;	//conn = 연결정보 (url, userid, userpw)
	private static ResultSet rs;
	

	
	public static void main(String[] args) {
		boolean sw = true;
	
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//fullVersion => orc1
		String userid = "heo";
		String userpw = "1234"; 
		
		try {
			Class.forName(driver);
			System.out.println("Driver loading success");
			
			try {
				conn = DriverManager.getConnection(url, userid, userpw);
				System.out.println("Connection success");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("url or userid or userpw is wrong");
			}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		//2.조회 프로그램 작성

		
		Scanner sc = new Scanner(System.in);
		
		SelectMember s1 = new SelectMember();
		InsertMember s2 = new InsertMember();
		UpdateMember s3 = new UpdateMember();
		DeleteMember s4 = new DeleteMember();
		 member6 m6 = new  member6();
		 
		while(sw) {
			System.out.println("---- 회원 정보 시스템 ----");
			System.out.println("1. 회원정보 조회");
			System.out.println("2. 회원정보 입력");
			System.out.println("3. 회원정보 수정");
			System.out.println("4. 회원정보 삭제");
			System.out.println("5. 시스템 종료");
			System.out.println("----------------------");
	
			System.out.println("확인하실 항목을 선택하세요.");
			int s = sc.nextInt();
			
			switch (s) {
				case 1 :{
					s1.input1(pstmt, conn, rs);
				}
					break;
		
				case 2 :
					s2.input2();
					break;
				case 3 :
					s3.input3();
					break;
				case 4 :
					s4.input4();
					break;
				default :
					break;
	
			}
		}
		


	}

	

}
