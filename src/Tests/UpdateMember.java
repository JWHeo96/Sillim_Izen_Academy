package Tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

interface Update {		
	
	public abstract void input3();
	
}
// heysh
public class UpdateMember implements Update {

	private static PreparedStatement pstmt;
	private static Connection conn;	//conn = 연결정보 (url, userid, userpw)
	private static ResultSet rs;
	
	public void DBConnection() {
		//0. 드라이버 로딩 및 연결 정보 설정
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//fullVersion => orc1
		String userid = "heo";
		String userpw = "1234"; 
		
		try {
			Class.forName(driver);
			System.out.println("Driver loading success");
			
			try {
				conn = DriverManager.getConnection(url, userid, userpw);
				System.out.println("Connection success");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("url or userid or userpw is wrong");
			}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void input3() {
		//3. 수정 프로그램 작성
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Input your ID to update : ");	//기준=id. id를 기준으로 id를 제외한 이름, 키, 몸무게, 나이 수정할 때.
			String id = sc.next();
			System.out.print("Input your Name : ");
			String name = sc.next();
			System.out.print("Input your Height : ");
			int height = sc.nextInt();
			System.out.print("Input your Weight : ");
			int weight = sc.nextInt();
			System.out.print("Input your Age : ");
			int age = sc.nextInt();
				
			pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");	//id가 기준이니까 'where' 써준다
			//String sql = "update member set name=?, height=?, weight=?, age=? where id=?";	
			//pstmt = conn.prepareStatement(sql);
			
				pstmt.setString(1, name);
				pstmt.setInt(2, height);
				pstmt.setInt(3, weight);
				pstmt.setInt(4, age);
				pstmt.setString(5, id);
									
			pstmt.executeUpdate();	//insert, update, delete 할 때 사용
			System.out.println("Input data ID to update success.");
		} catch (SQLException e) {
			e.printStackTrace();
		System.out.println("Input data ID to update or SQL sentence is wrong.");
		}	
				
		//3-1. 결과 출력 부분
		System.out.println("----------- 수정된 회원 정보 -----------");
		System.out.println("------------------------------------");
		System.out.println("id\tname\theight\tweight\tage");
		System.out.println("------------------------------------");
		try {
			while(rs.next()) {
				String id = rs.getString("id");	//(1) or ("id")
				String name = rs.getString("name");	//(2) or ("name")
				int height = rs.getInt("height");	//(3) or ("height")
				int weight = rs.getInt("weight");	//(4) or ("weight")
				int age = rs.getInt("age");	//(5) or ("age")
				
				System.out.println(id + "\t" + name + "\t" + height + "\t" + weight + "\t" + age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------------------------------");
		
	
	
	}
	
	
}


