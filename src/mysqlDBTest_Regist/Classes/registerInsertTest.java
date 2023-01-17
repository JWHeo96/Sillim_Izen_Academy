package mysqlDBTest_Regist.Classes;
import mysqlDBTest_Regist.*;
import mysqlDBTest_Regist.Interfaces.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class registerInsertTest extends registerDBConnectTest implements registerInter_Insert {

	private PreparedStatement pstmt;

	@Override
	public void registerInsert() {
		// 2. 입력 프로그램 작성
			registerDBConnect();
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("학번을 입력해주세요.");
				int hakbun = sc.nextInt();
				System.out.println("과목을 입력해주세요.");
				String kwamok = sc.next();
				System.out.println("반을 입력해주세요.");
				String ezenclass= sc.next();
				System.out.println("중간 성적을 입력해주세요.");
				int medsungjuk= sc.nextInt();
				System.out.println("최종 성적을 입력해주세요.");
				int finsungjuk = sc.nextInt();
				
				pstmt = conn.prepareStatement("insert into register values(?, ?, ?, ?, ?)");
					pstmt.setInt(1, hakbun);
					pstmt.setString(2, kwamok);
					pstmt.setString(3, ezenclass);
					pstmt.setInt(4, medsungjuk);
					pstmt.setInt(5, finsungjuk);

				pstmt.executeUpdate(); // insert, update, delete 사용
				
				System.out.println("데이터 입력에 성공하였습니다.!!!");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("입력 데이터가 문제이거나 SQL 문장이 잘못되었습니다.!!!");
			}

	}

}
