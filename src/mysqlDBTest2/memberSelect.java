package mysqlDBTest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class memberSelect { 

	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

//회원관리 조회시스템 개발

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
		
		// 2. 조회 프로그램 작성
		String sql = "select * from member order by name desc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL 문장이 잘못되었습니다.!!!");
		}
		
		System.out.println("=================================="
				+ "===");
		System.out.println("번호\t이름\t키\t몸무게\t나이");
		System.out.println("=====================================");
		// 3. 결과 출력 부문
		try {
			while(rs.next()) {
				String id = rs.getString(1); //(1)
				String name = rs.getString(2); //(2)
				double height = rs.getDouble(3); //(3)
				double weight = rs.getDouble("weight"); //(4)
				int age = rs.getInt("age"); //(5)
				
				System.out.println(id + "\t" + name + "\t" + height + "\t" + weight +  "\t" + age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
