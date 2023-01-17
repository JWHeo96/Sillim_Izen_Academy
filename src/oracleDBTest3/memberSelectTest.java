package oracleDBTest3;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class memberSelectTest extends memberDBConnectTest implements memberInter_Select {
	public static PreparedStatement pstmt;
	public static ResultSet rs;

	@Override
	public void memberSelect() {
		
		// 조회 프로그램 작성
		String sql = "select * from member order by id desc";
		
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
		// 결과 출력 부문
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
