package EZ25;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Register extends Log {	
	String id = null;
	
	
	Scanner sc = new Scanner(System.in);
	public void defaultSet() {
		try {
			String sql = "insert into store_product values(?, 'A001', '����', '50', '1500')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();

			sql = "insert into store_product values(?, 'B001', '���', '50', '4500')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			sql = "insert into store_product values(?, 'C001', '����', '50', '3200')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			sql = "insert into store_product values(?, 'D001', '���ö�', '50', '5200')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			sql = "insert into store_product values(?, 'E001', '���', '50', '2700')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			sql = "insert into store_product values(?, 'F001', 'Ŀ��', '50', '2700')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			sql = "insert into store_product values(?, 'G001', '����', '50', '1800')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			sql = "insert into store_product values(?, 'H001', '����', '50', '7800')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			sql = "insert into store_product values(?, 'I001', '���̽�ũ��', '50', '1600')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			sql = "insert into store_product values(?, 'J001', '��', '50', '1000')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void storeOpen() {
		dbConnection();
		System.out.println("--ȸ�� ����--");
		String storeOpen = "insert into mgmt_member values(?, ?, ?, ?, ?)";
		try {
			System.out.print("���̵�: ");
			id = sc.next();
			System.out.print("��й�ȣ: ");
			String pwd = sc.next();
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("��ȭ��ȣ: ");
			String tel = sc.next();
			System.out.print("�ּ�: ");
			String addr = sc.next();
			
			pstmt = conn.prepareStatement(storeOpen);
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				pstmt.setString(3, name);
				pstmt.setString(4, tel);
				pstmt.setString(5, addr);
				
			pstmt.executeUpdate();

			System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		defaultSet();
	}
	public void storeClose() {
		dbConnection();
		System.out.println("Ż���Ͻ� ���̵� �Է����ּ���.");
		String closeId = sc.next();
		System.out.println("���� Ż�� �Ͻðڽ��ϱ�? (y/n)");
		if((sc.next()).equals("y")) {
			String deleteId = "delete from mgmt_member where id=?";
			String deletespId = "delete from store_product where sp_store=?";
			String deletessId = "delete from store_sales where ss_store=?";
			String deletemsId = "delete from mgmt_sales where ms_store=?";
			try {
				pstmt = conn.prepareStatement(deleteId);
				pstmt.setString(1, closeId);				
				pstmt.executeUpdate();
				
				pstmt = conn.prepareStatement(deletespId);
				pstmt.setString(1, closeId);				
				pstmt.executeUpdate();
				
				pstmt = conn.prepareStatement(deletessId);
				pstmt.setString(1, closeId);				
				pstmt.executeUpdate();
				
				pstmt = conn.prepareStatement(deletemsId);
				pstmt.setString(1, closeId);				
				pstmt.executeUpdate();
				System.out.println("ȸ�� Ż�� �Ϸ�Ǿ����ϴ�!\n\n\n");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if((sc.next()).equals("n")) {
			sc.close();
		}
	}

}
