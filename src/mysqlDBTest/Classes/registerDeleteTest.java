package mysqlDBTest.Classes;
import mysqlDBTest.*;
import mysqlDBTest.Interfaces.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracleDBTest3.memberInter_Delete;

public class registerDeleteTest extends registerDBConnectTest implements registerInter_Delete {

	private PreparedStatement pstmt;

	@Override
	public void registerDelete() {
		// 2. 삭제 프로그램 작성
				registerDBConnect();
				try {
					Scanner sc = new Scanner(System.in);
					System.out.println("삭제 할 아이디를 입력해주세요.");
					String hakbun = sc.next();
					
//					pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");
					String sql ="delete from register where hakbun=?";
						pstmt = conn.prepareStatement(sql);
					
						pstmt.setString(1, hakbun);

					pstmt.executeUpdate(); // insert, update, delete 사용
					
					System.out.println("데이터 삭제가 성공하였습니다.!!!");
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("삭제 아이디 데이터가 문제이거나 SQL 문장이 잘못되었습니다.!!!");
				}
		
	}


}
