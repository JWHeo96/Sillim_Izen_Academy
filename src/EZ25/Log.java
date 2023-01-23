package EZ25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Log {
	public static String user = null;

	public static Connection conn;
	public static PreparedStatement pstmt;
	public static ResultSet rs;
	static String checkpwd = null;
	static String id = null;
	
	public static void dbConnection() {
		String driver ="oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "ez25";
		String userpwd = "1234";
		
		try {
			Class.forName(driver);
			try {
				conn = DriverManager.getConnection(url, userid, userpwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
		
	public static void login() {
		EZ25 ez25 = new EZ25();
		
		while(true) {
			dbConnection();
			Scanner sc = new Scanner(System.in);
			System.out.print("���̵�> ");
			id = sc.next();
			System.out.print("��й�ȣ> ");
			String pwd = sc.next();
			setId(id);
			
			String checkId = "select * from mgmt_member where id = ? " ;
			try {
		
				pstmt = conn.prepareStatement(checkId);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					checkpwd = rs.getString("pwd");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pwd.equals(checkpwd)) {
					ez25.clearScreen();
					System.out.println(id + "�� ȯ���մϴ�!");
					break;
				} else {
					throw new InputMismatchException();
				}
			} catch(InputMismatchException e) {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���\n");
				sc.nextLine();
			}
		}
		
	}
	
	public static String logout() {
		String logout = "continue";
		return logout;
	}
	
	public String getId() {
		return user;
	}
	public static void setId(String id) {
		user = id;
	}
}
