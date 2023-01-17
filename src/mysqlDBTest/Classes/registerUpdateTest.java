package mysqlDBTest.Classes;
import mysqlDBTest.*;
import mysqlDBTest.Interfaces.*;

import static oracleDBTest3.memberDBConnectTest.conn;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class registerUpdateTest extends registerDBConnectTest implements registerInter_Update {

	private PreparedStatement pstmt;

	@Override
	public void registerUpdate() {
		// 2. 수정 프로그램 작성
		registerDBConnect();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("수정 할 학번을 입력해주세요.");
			int hakbun = sc.nextInt();
			System.out.println("과목을 입력해주세요.");
			String kwamok = sc.next();
			System.out.println("반을 입력해주세요.");
			String ezenclass= sc.next();
			System.out.println("중간 성적을 입력해주세요.");
			int medsungjuk = sc.nextInt();
			System.out.println("최종 성적을 입력해주세요.");
			int finsungjuk = sc.nextInt();
			
//			pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");
			String sql ="update register set kwamok=?, ezenclass=?, medsungjuk=?, finsungjuk=? where hakbun=?";
				pstmt = conn.prepareStatement(sql);
			
				pstmt.setString(1, kwamok);
				pstmt.setString(2, ezenclass);
				pstmt.setInt(3, medsungjuk);
				pstmt.setInt(4, finsungjuk);
				pstmt.setInt(5, hakbun);

			pstmt.executeUpdate(); // insert, update, delete 사용
			
			System.out.println("데이터 수정이 성공하였습니다.!!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("수정 데이터가 문제이거나 SQL 문장이 잘못되었습니다.!!!");
		}
	}

}
