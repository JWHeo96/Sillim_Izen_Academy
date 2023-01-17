package mysqlDBTest_Backup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class registerSelect { 

	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

//학생 관리 조회 시스템 개발

	public static void main(String[] args) {
		
		// 1. 드라이버 로딩 및 연결정보 설정
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/heoDB"; // fullVersion => orcl
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
		
		// 2. 조회 프로그램 작성
		String sql = "select * from register order by hakbun asc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL 문장이 잘못되었습니다.!!!");
		}
		
		System.out.println("===========학생 정보 조회 시스템===========");
		System.out.println("학번\t과목\t반\t중간성적\t최종성적");
		System.out.println("======================================");
		// 3. 결과 출력 부문
		try {
			while(rs.next()) {
				int hakbun = rs.getInt(1); //(1)
				String kwamok = rs.getString(2); //(2)
				String ezenclass = rs.getString(3); //(3)
				int medsungjuk = rs.getInt("medsungjuk"); //(4)
				int finsungjuk = rs.getInt("finsungjuk"); //(5)
				
				System.out.println(hakbun + "\t" + kwamok + "\t" + ezenclass + "\t" + medsungjuk +  "\t" + finsungjuk);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
