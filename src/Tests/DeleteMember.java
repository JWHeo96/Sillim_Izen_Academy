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

interface Delete {
	
	public abstract int input4();
}

public class DeleteMember implements Delete {

	private static PreparedStatement pstmt;
	private static Connection conn;	//conn = 연결정보 (url, userid, userpw)
	private static ResultSet rs;
	
	@Override
	public int input4() {

		
		//4. 삭제 프로그램 작성
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Input your ID to delete : ");	//기준=id. id를 기준으로 id를 제외한 이름, 키, 몸무게, 나이 수정할 때.
			String id = sc.next();
			
				
			pstmt = conn.prepareStatement("delete from member where id=?");	//id를 삭제할 거니까 
			//String sql = "update member set name=?, height=?, weight=?, age=? where id=?";	
			//pstmt = conn.prepareStatement(sql);
			
				pstmt.setString(1, id);
									
			pstmt.executeUpdate();	//insert, update, delete 할 때 사용
			System.out.println("ID to delete success.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ID to delete or SQL sentence is wrong.");
		}	
		
		return 4;
	}
	
	
}