package EZ25;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Product_Sales extends Log {
	Scanner sc = new Scanner(System.in);
	public ResultSet rs;
	
	int productPrice = 0; 
	int sumPrice = 0; 
	int difStock = 0;
	String storeName = null;
	int productStock = 0;
	public void salesInsert() {
		
		dbConnection();
		
		System.out.print("��ǰ��> ");
		String productName = sc.next();
		System.out.print("����> ");
		int productQuantity = sc.nextInt();
		
		// �Է��� ��ǰ�� ���� �̾ƿ���
		String salesInsert = "select * from store_product where sp_name = ? " ;
		// ����_���� ���̺� ���� �̷� �ֱ�
		String insertSales = "insert into store_sales values(?, ?, ?, ?)";
		// ����_��� ���̺� ������ ������ŭ ���̳ʽ� �� ������Ʈ�ϱ�
		String updateStock = "update store_product set sp_quantity = ? where sp_store = ? and sp_name = ?";
		try {
			// ���
			pstmt = conn.prepareStatement(salesInsert);
			pstmt.setNString(1, productName);
			rs = pstmt.executeQuery();
	
			while(rs.next()) {
				storeName = rs.getString("sp_store");
				productPrice = rs.getInt("sp_price");
				productStock = rs.getInt("sp_quantity");
			}
			sumPrice = productPrice * productQuantity;
			difStock = productStock - productQuantity;
			
			// ���� ���̺� �� ����
			pstmt = conn.prepareStatement(insertSales);
			pstmt.setString(1, storeName);
			pstmt.setString(2, productName);
			pstmt.setInt(3, productQuantity);
			pstmt.setInt(4, sumPrice);
			
			pstmt.executeUpdate();
			
			// ��� ���� ���̳ʽ� ó��
			pstmt = conn.prepareStatement(updateStock);
			pstmt.setInt(1, difStock);
			pstmt.setString(2, id);
			pstmt.setString(3, productName);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	

}
