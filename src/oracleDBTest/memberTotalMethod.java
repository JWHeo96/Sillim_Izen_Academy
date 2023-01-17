package oracleDBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class memberTotalMethod {
	
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	private void DBConnection() {
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
	
	private void memberUpdate() {
	// 2. 수정 프로그램 작성
		DBConnection();
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
			
//			pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");
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

	private void memberDelete() {
	// 2. 삭제 프로그램 작성
		DBConnection();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("삭제 할 아이디를 입력해주세요.");
			String id = sc.next();
			
//			pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");
			String sql ="delete from member where id=?";
				pstmt = conn.prepareStatement(sql);
			
				pstmt.setString(1, id);

			pstmt.executeUpdate(); // insert, update, delete 사용
			
			System.out.println("데이터 삭제가 성공하였습니다.!!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("삭제 아이디 데이터가 문제이거나 SQL 문장이 잘못되었습니다.!!!");
		}

	}

	private void memberInsert() {
		// 2. 입력 프로그램 작성
		DBConnection();
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

	private void memberSelect() {
		DBConnection();
				
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

	public static void main(String[] args) {
		memberTotalMethod mtm = new memberTotalMethod();
		boolean stop = true;
		
		while(stop) {
			System.out.println("--------------------------");
			System.out.println("1.회원정보 조회");
			System.out.println("2.회원정보 입력");
			System.out.println("3.회원정보 수정");
			System.out.println("4.회원정보 삭제");
			System.out.println("5.시스템 종료");
			System.out.println("--------------------------");
			
			Scanner sc = new Scanner(System.in);
			String x = sc.next();
			
			switch(x) {
				case "1": mtm.memberSelect(); break;
				case "2": mtm.memberInsert(); break;
				case "3": mtm.memberUpdate(); break;
				case "4": mtm.memberDelete(); break;
				case "5": stop = false; 
			}
		}
	}

}
