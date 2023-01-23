package EZ25;

import java.sql.SQLException;

public class Store_Inquiry extends Log {

	public void siSales() {
		dbConnection();
		
		String sql = "select * from store_sales where ss_store = ?";
		
		System.out.println("============================");
		System.out.println("점포명\t품명\t판매수량\t매출");
		System.out.println("============================");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String ss_store = rs.getString(1);
				String ss_name = rs.getString(2);
				String ss_quantity = rs.getString(3);
				String ss_price = rs.getString(4);
				System.out.println(ss_store + "\t" + ss_name + "\t" +  ss_quantity + "\t" +  ss_price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	public void siStock() {
		dbConnection();
		
		String sql = "select * from store_product where sp_store = ?";
		
		System.out.println("====================================");
		System.out.println("점포명\t품번\t품명\t판매\t가격");
		System.out.println("====================================");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String sp_store = rs.getString(1);
				String sp_numb = rs.getString(2);
				String sp_name = rs.getString(3);
				int sp_quantity = rs.getInt(4);
				int sp_price = rs.getInt(5);
				System.out.println(sp_store + "\t" + sp_numb + "\t" +   sp_name + "\t" +  sp_quantity + "\t" +  sp_price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}
