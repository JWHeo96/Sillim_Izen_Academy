package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {

	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

	public static void main(String[] args) {

		// 1. 드라이버 및 정보 로딩
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "heo";
		String userpwd = "1234";
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 연결 성공");
			try {
				conn = DriverManager.getConnection(url, userid, userpwd);
				System.out.println("정보 연결 성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 2. 정보 입력 프로그램
		String sql ="select * from member order by desc";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("쿼리문 실행 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 3. 출력 프로그램
		try {
			while(rs.next()) {
				String id = rs.getString("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
