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

interface Insert {
	
	public abstract int input2();
	
}

public class InsertMember implements Insert {
	
	private static PreparedStatement pstmt;
	private static Connection conn;	//conn = 연결정보 (url, userid, userpw)
	private static ResultSet rs;

	@Override
	public int input2() {

		//2. 입력 프로그램 작성
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Input your ID : ");
			String id = sc.next();
			System.out.print("Input your Name : ");
			String name = sc.next();
			System.out.print("Input your Height : ");
			int height = sc.nextInt();
			System.out.print("Input your Weight : ");
			int weight = sc.nextInt();
			System.out.print("Input your Age : ");
			int age = sc.nextInt();
				
			pstmt = conn.prepareStatement("insert into member values(?, ?, ?, ?, ?)");	//입력하는 갯수만큼 ? 써준다
				pstmt.setString(1, id);
				pstmt.setString(2, name);
				pstmt.setDouble(3, height);
				pstmt.setDouble(4, weight);
				pstmt.setInt(5, age);
									
			pstmt.executeUpdate();	//insert, update, delete 할 때 사용
			System.out.println("Data input success.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Input data or SQL sentence is wrong.");
		}	
		
			
		//2-1. 결과 출력 부분
		System.out.println("----------- New 회원 정보 ------------");
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
		
		return 2;
		
	}

	
}