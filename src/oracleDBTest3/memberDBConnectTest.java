package oracleDBTest3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class memberDBConnectTest implements memberInter_DBConnection {
	public static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	@Override
	public void memberDBConnect() {
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
	}

}
