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

interface select {		
	
	public abstract void input1(PreparedStatement pstmt, Connection conn, ResultSet rs);

}

public class SelectMember implements select {
	
	@Override
	public void input1(PreparedStatement pstmt, Connection conn, ResultSet rs) {
		//2. 조회 프로그램 작성
		String sql = "select * from member";	//order by 기준 - 기준으로 어센딩, 디센딩 나열
		try {

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL sentence is wrong");
		}	
		
	
			
		//1-1. 결과 출력 부분
		System.out.println("----------- 회원 정보 시스템 -----------");
		System.out.println("------------------------------------");
		System.out.println("id\tname\theight\tweight\tage");
		System.out.println("------------------------------------");
		try {
			while(rs.next()) {
				String id = rs.getString("id");	//(1) or ("id")
				String name = rs.getString("name");	//(2) or ("name")
				double height = rs.getDouble("height");	//(3) or ("height")
				double weight = rs.getDouble("weight");	//(4) or ("weight")
				int age = rs.getInt("age");	//(5) or ("age")
				
				System.out.println(id + "\t" + name + "\t" + height + "\t" + weight + "\t" + age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		System.out.println("------------------------------------");
				

	}
	
	
	
}