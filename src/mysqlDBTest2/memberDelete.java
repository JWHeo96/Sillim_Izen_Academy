package mysqlDBTest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class memberDelete { 

	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

//회원 정보 삭제 시스템 개발

	public static void main(String[] args) {
		
		// 1. 드라이버 로딩 및 연결정보 설정
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/heoDB2"; // fullVersion => orcl
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
		
		// 2. 삭제 프로그램 작성
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("삭제 할 아이디를 입력해주세요.");
			String id = sc.next();
			
//			pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");
			String sql ="delete from member where id=?";
				pstmt = conn.prepareStatement(sql);
			
				pstmt.setString(1, id);

			pstmt.executeUpdate(); // insert, update, delete 사용
			
			System.out.println("데이터 삭제가 성공하였습니다.!!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("삭제 아이디 데이터가 문제이거나 SQL 문장이 잘못되었습니다.!!!");
		}

	}
}
