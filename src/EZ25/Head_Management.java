package EZ25;

import java.sql.SQLException;
import java.util.Scanner;

public class Head_Management extends Log {
	Scanner sc = new Scanner(System.in);

	public void headInsert() {
		dbConnection();

		String sql = "insert into mgmt_product values(?,?,?,?)";
		try {
			System.out.print("ǰ��> ");
			String numb = sc.next();
			System.out.print("ǰ��> ");
			String name = sc.next();
			System.out.print("����> ");
			int quantity = sc.nextInt();
			System.out.print("����> ");
			int price = sc.nextInt();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, numb);
			pstmt.setString(2, name);
			pstmt.setInt(3, quantity);
			pstmt.setInt(4, price);
			
			pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("��ǰ ��� �Ϸ�!\n\n\n");
	}
	public void headUpdate() {
		dbConnection();

		String sql = "update mgmt_product set mp_name=?, mp_quantity=?, mp_price=? where mp_numb=?";
		try {
			System.out.print("ǳ��> ");
			String numb = sc.next();
			System.out.print("ǰ��> ");
			String name = sc.next();
			System.out.print("����> ");
			int quantity = sc.nextInt();
			System.out.print("����> ");
			int price = sc.nextInt();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, quantity);
			pstmt.setInt(3, price);
			pstmt.setString(4, numb);
			
			pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("��ǰ ���� �Ϸ�!\n\n\n");
	}
	public void headDelete() {
		dbConnection();

		String sql = "delete from mgmt_product where mp_numb=?";
		try {
			System.out.print("ǰ��> ");
			String numb = sc.next();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, numb);
			
			pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("��ǰ ���� �Ϸ�!\n\n\n");
	}
	public void floodStore() {
		// �����鿡�� ��ǰ ����
		dbConnection();
		System.out.print("������> ");
		String store = sc.next();
		System.out.print("��ǰ��> ");
		String name = sc.next();
		System.out.print("����> ");
		int quantity = sc.nextInt();
		
		try {
			String getNumPrice = "select * from mgmt_product";
			pstmt = conn.prepareStatement(getNumPrice);
			rs = pstmt.executeQuery();
			String numb = null;
			int price = 0;
			int count = 0;
			while(rs.next()) {
				numb = rs.getString("mp_numb");
				price = rs.getInt("mp_price");
				count = rs.getInt("mp_quantity");
			}
			
			
			String sql = "insert into store_product values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, store);
			pstmt.setString(2, numb);
			pstmt.setString(3, name);
			pstmt.setInt(4, quantity);
			pstmt.setInt(5, price);
			pstmt.executeUpdate();
			
			String updateTable = "update mgmt_product set mp_quantity=? where mp_name = ?";
			pstmt = conn.prepareStatement(updateTable);
			pstmt.setInt(1, count-quantity);
			pstmt.setString(2, name);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
