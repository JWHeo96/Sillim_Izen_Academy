package ConvenienceStore;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RegistMember extends ConnectDB {	
	
	private PreparedStatement pstmt;

	public void RegistMemb(String userid, String userpwd){
		ConnectDB cd = new ConnectDB();
		cd.ConnectionDB(userid, userpwd);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 id를 입력해주세요");
		String id = sc.next();
		System.out.println("생성할 pwd를 입력해주세요");
		String pwd = sc.next();
		
		String sql = "create user " + id + " identified by " + pwd;
		String sql2 = "grant connect, resource, dba to " + id;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement(sql2);
			pstmt.executeUpdate();
			cd.ConnectionDB(id, pwd);
					
			String createTable1 = "create table calc (product varchar(10), count int, price int )";
			pstmt = conn.prepareStatement(createTable1); 
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
