package oracleDBTest3;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class memberInsertTest extends memberDBConnectTest implements memberInter_Insert {

	private PreparedStatement pstmt;

	@Override
	public void memberInsert() {
		// 2. 입력 프로그램 작성
		memberDBConnect();
				try {
					Scanner sc = new Scanner(System.in);
					System.out.println("아이디를 입력해주세요.");
					String id = sc.next();
					System.out.println("이름을 입력해주세요.");
					String name = sc.next();
					System.out.println("키를 입력해주세요.");
					double height = sc.nextDouble();
					System.out.println("몸무게를 입력해주세요.");
					double weight = sc.nextDouble();
					System.out.println("나이를 입력해주세요.");
					int age = sc.nextInt();
					
					pstmt = conn.prepareStatement("insert into member values(?, ?, ?, ?, ?)");
						pstmt.setString(1, id);
						pstmt.setString(2, name);
						pstmt.setDouble(3, height);
						pstmt.setDouble(4, weight);
						pstmt.setInt(5, age);

					pstmt.executeUpdate(); // insert, update, delete 사용
					
					System.out.println("데이터 입력에 성공하였습니다.!!!");
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("입력 데이터가 문제이거나 SQL 문장이 잘못되었습니다.!!!");
				}		
	}

}
