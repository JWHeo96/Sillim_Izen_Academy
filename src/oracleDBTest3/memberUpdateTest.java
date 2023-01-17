package oracleDBTest3;

import static oracleDBTest3.memberDBConnectTest.conn;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class memberUpdateTest extends memberDBConnectTest implements memberInter_Update {

	private PreparedStatement pstmt;

	@Override
	public void memberUpdate() {
		// 2. 수정 프로그램 작성
				memberDBConnect();
				try {
					Scanner sc = new Scanner(System.in);
					System.out.println("수정 할 아이디를 입력해주세요.");
					String id = sc.next();
					System.out.println("이름을 입력해주세요.");
					String name = sc.next();
					System.out.println("키를 입력해주세요.");
					double height = sc.nextDouble();
					System.out.println("몸무게를 입력해주세요.");
					double weight = sc.nextDouble();
					System.out.println("나이를 입력해주세요.");
					int age = sc.nextInt();
					
//					pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");
					String sql ="update member set name=?, height=?, weight=?, age=? where id=?";
						pstmt = conn.prepareStatement(sql);
					
						pstmt.setString(1, name);
						pstmt.setDouble(2, height);
						pstmt.setDouble(3, weight);
						pstmt.setInt(4, age);
						pstmt.setString(5, id);

					pstmt.executeUpdate(); // insert, update, delete 사용
					
					System.out.println("데이터 수정이 성공하였습니다.!!!");
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("수정 데이터가 문제이거나 SQL 문장이 잘못되었습니다.!!!");
				}		
	}

}
