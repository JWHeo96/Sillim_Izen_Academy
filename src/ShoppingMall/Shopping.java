package ShoppingMall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Shopping {

	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

	public static void main(String[] args) {
		
		// 1. 드라이버 및 정보 연결
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "Shop";
		String userpwd = "1234";
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 연결 성공!");
			try {
				conn = DriverManager.getConnection(url, userid, userpwd);
				System.out.println("연결 정보 연동 완료!");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 2. 스키마 조회 프로그램
		String sql = "select * from memberTBL";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			while(rs.next()) {
				String id = rs.getString("memberId");
				String name = rs.getString("memberName");
				String address = rs.getString("memberAddress");
				
				System.out.println(id + "\t" + name + "\t" + address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
		// 3. 출력 부분
		
		
		
	}
}
