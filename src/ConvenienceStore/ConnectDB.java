package ConvenienceStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDB{
	
	public static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	public void ConnectionDB(String userid, String userpwd) {
		// 1. 드라이버 로딩 및 연결정보 설정
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // fullVersion => orcl
	
		try {
			Class.forName(driver);
			System.out.println("Oracle Driver Loading Successed!!!");
			try {
				conn = DriverManager.getConnection(url, userid, userpwd);
				System.out.println("Connection is Successed!!!");
			} catch (SQLException e) {
				System.out.println("url, userid, userpwd가 잘못되었습니다.");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
	

