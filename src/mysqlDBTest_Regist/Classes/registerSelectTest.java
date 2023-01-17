package mysqlDBTest_Regist.Classes;
import mysqlDBTest_Regist.*;
import mysqlDBTest_Regist.Interfaces.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class registerSelectTest extends registerDBConnectTest implements registerInter_Select {
	public static PreparedStatement pstmt;
	public static ResultSet rs;

	@Override
	public void registerSelect() {
		registerDBConnect();
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
