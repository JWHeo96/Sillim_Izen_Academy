package mysqlDBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class registerUpdate { 

	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

//회원 정보 수정 시스템 개발

	public static void main(String[] args) {
		
		// 1. 드라이버 로딩 및 연결정보 설정
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/heoDB"; // fullVersion => orclrsion => orcl
		String userid = "heo";
		String userpwd = "1234";
		
		try {
			Class.forName(driver);
			System.out.println("Oracle Driver Loading Successed!!!");
			
			try {
				conn = DriverManager.getConnection(url, userid, userpwd);
				System.out.println("Connection is Successed!!!");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("url, userid, userpwd가 잘못되었습니다.");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 2. 수정 프로그램 작성
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("수정 할 학번을 입력해주세요.");
			int hakbun = sc.nextInt();
			System.out.println("과목을 입력해주세요.");
			String kwamok = sc.next();
			System.out.println("반을 입력해주세요.");
			String ezenclass= sc.next();
			System.out.println("중간 성적을 입력해주세요.");
			int medsungjuk = sc.nextInt();
			System.out.println("최종 성적을 입력해주세요.");
			int finsungjuk = sc.nextInt();
			
//			pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");
			String sql ="update register set kwamok=?, ezenclass=?, medsungjuk=?, finsungjuk=? where hakbun=?";
				pstmt = conn.prepareStatement(sql);
			
				pstmt.setString(1, kwamok);
				pstmt.setString(2, ezenclass);
				pstmt.setInt(3, medsungjuk);
				pstmt.setInt(4, finsungjuk);
				pstmt.setInt(5, hakbun);

			pstmt.executeUpdate(); // insert, update, delete 사용
			
			System.out.println("데이터 수정이 성공하였습니다.!!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("수정 데이터가 문제이거나 SQL 문장이 잘못되었습니다.!!!");
		}

	}
}
