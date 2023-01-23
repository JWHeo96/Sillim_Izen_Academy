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
		
		System.out.print("상품명> ");
		String productName = sc.next();
		System.out.print("수량> ");
		int productQuantity = sc.nextInt();
		
		// 입력한 상품의 가격 뽑아오기
		String salesInsert = "select * from store_product where sp_name = ? " ;
		// 점포_매출 테이블에 구매 이력 넣기
		String insertSales = "insert into store_sales values(?, ?, ?, ?)";
		// 점포_재고 테이블에 구매한 수량만큼 마이너스 값 업데이트하기
		String updateStock = "update store_product set sp_quantity = ? where sp_store = ? and sp_name = ?";
		try {
			// 계산
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
			
			// 매출 테이블에 행 삽입
			pstmt = conn.prepareStatement(insertSales);
			pstmt.setString(1, storeName);
			pstmt.setString(2, productName);
			pstmt.setInt(3, productQuantity);
			pstmt.setInt(4, sumPrice);
			
			pstmt.executeUpdate();
			
			// 재고 수량 마이너스 처리
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
