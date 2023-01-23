package EZ25;

import java.sql.SQLException;

public class Calculator extends Product_Sales {
	
	public void deadLine() {
		
		String deadLine ="INSERT INTO MGMT_SALES VALUES(count.NEXTVAL , ? ,(SELECT SUM(SS_PRICE) FROM STORE_SALES WHERE SS_STORE = ?))";
		String clear = "DELETE FROM STORE_SALES WHERE SS_STORE = ?";
		try {
			pstmt = conn.prepareStatement(deadLine);
			pstmt.setString(1, id);
			pstmt.setString(2, id);
			pstmt.executeUpdate();

			pstmt = conn.prepareStatement(clear);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
