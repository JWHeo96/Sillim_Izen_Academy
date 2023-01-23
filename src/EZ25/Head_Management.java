package EZ25;

import java.sql.SQLException;
import java.util.Scanner;

public class Head_Management extends Log {
	Scanner sc = new Scanner(System.in);

	public void headInsert() {
		dbConnection();

		String sql = "insert into mgmt_product values(?,?,?,?)";
		try {
			System.out.print("품번> ");
			String numb = sc.next();
			System.out.print("품명> ");
			String name = sc.next();
			System.out.print("수량> ");
			int quantity = sc.nextInt();
			System.out.print("가격> ");
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

		System.out.println("상품 등록 완료!\n\n\n");
	}
	public void headUpdate() {
		dbConnection();

		String sql = "update mgmt_product set mp_name=?, mp_quantity=?, mp_price=? where mp_numb=?";
		try {
			System.out.print("풍번> ");
			String numb = sc.next();
			System.out.print("품명> ");
			String name = sc.next();
			System.out.print("수량> ");
			int quantity = sc.nextInt();
			System.out.print("가격> ");
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
		
		System.out.println("상품 수정 완료!\n\n\n");
	}
	public void headDelete() {
		dbConnection();

		String sql = "delete from mgmt_product where mp_numb=?";
		try {
			System.out.print("품번> ");
			String numb = sc.next();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, numb);
			
			pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("상품 삭제 완료!\n\n\n");
	}
	public void floodStore() {
		// 점포들에게 상품 전달
		dbConnection();
		System.out.print("점포명> ");
		String store = sc.next();
		System.out.print("상품명> ");
		String name = sc.next();
		System.out.print("수량> ");
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
