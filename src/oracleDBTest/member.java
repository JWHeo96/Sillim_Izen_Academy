package oracleDBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * member table로 구성
 * 
 */
public class member {

	private static Connection conn; // DB연결정보
	private static PreparedStatement pstmt; // 보안성: sql 실행
	private static ResultSet rs; // 최종 결과 출력 용도

	public static void main(String[] args) throws ClassNotFoundException {
		//1. 드라이버 로딩
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "heo";
		String pwd = "1234";
		
		//2. DB에 연결 설정
		Class.forName(driver);
		System.out.println("Oracle Driver Loading Success!!!");
		
		try {
			conn = DriverManager.getConnection(url, userid,  pwd);
			System.out.println("Oracle Connection Success!!!");
		} catch(Exception e) {
			e.printStackTrace();
		}

		//3. 데이터 조회
		String sql = "select * from member"; // sql 문장
		try {
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			System.out.println("---------------------------------------");
			System.out.println(" 아이디\t이름\t키\t몸무게\t나이");
			System.out.println("---------------------------------------");
	
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				double height = rs.getDouble("height");
				double weight = rs.getDouble("weight");
				int age = rs.getInt("age");
				System.out.println(id + "\t" + name + "\t" + height + "\t" + weight + "\t" + age);
			}
			System.out.println("---------------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} 
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
