package oracleDBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class memberUpdate { 

	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

//회원 정보 수정 시스템 개발

	public static void main(String[] args) {
		
		// 1. 드라이버 로딩 및 연결정보 설정
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // fullVersion => orcl
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
			System.out.println("수정 할 아이디를 입력해주세요.");
			String id = sc.next();
			System.out.println("이름을 입력해주세요.");
			String name = sc.next();
			System.out.println("키를 입력해주세요.");
			double height = sc.nextDouble();
			System.out.println("몸무게를 입력해주세요.");
			double weight = sc.nextDouble();
			System.out.println("나이를 입력해주세요.");
			int age = sc.nextInt();
			
//			pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");
			String sql ="update member set name=?, height=?, weight=?, age=? where id=?";
				pstmt = conn.prepareStatement(sql);
			
				pstmt.setString(1, name);
				pstmt.setDouble(2, height);
				pstmt.setDouble(3, weight);
				pstmt.setInt(4, age);
				pstmt.setString(5, id);

			pstmt.executeUpdate(); // insert, update, delete 사용
			
			System.out.println("데이터 수정이 성공하였습니다.!!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("수정 데이터가 문제이거나 SQL 문장이 잘못되었습니다.!!!");
		}

	}
}
