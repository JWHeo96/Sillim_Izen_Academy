package EZ25;

import java.sql.SQLException;
import java.util.Scanner;

public class Head_inquiry extends Log {
	Scanner sc = new Scanner(System.in);
	
	
	public void hiSales() {
		dbConnection();
		
		String sql = "select * from mgmt_sales";
		
		System.out.println("======================");
		System.out.println("��ȣ\t����\t����");
		System.out.println("======================");
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int ms_cnt = rs.getInt(1);
				String ms_store = rs.getString(2);
				int ms_sales = rs.getInt(3);
				System.out.println(ms_cnt + "\t" + ms_store + "\t" +  ms_sales);
				} 
		}catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	public void hiStock() {
		dbConnection();
		
		String sql = "select * from mgmt_product";
		
		System.out.println("============================");
		System.out.println("ǰ��\tǰ��\t����\t����");
		System.out.println("============================");
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String mp_numb = rs.getString(1);
				String mp_name = rs.getString(2);
				int mp_quantity = rs.getInt(3);
				int mp_price = rs.getInt(4);
				System.out.println(mp_numb + "\t" + mp_name + "\t" +  mp_quantity + "\t" +  mp_price);
				} 
		}catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	public void hiMember() {
		dbConnection();
		
		String sql = "select * from mgmt_member";
		
		System.out.println("=============================================");
		System.out.println("���̵�\t��й�ȣ\t�̸�\t��ȭ��ȣ\t\t�ּ�");
		System.out.println("=============================================");
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String pwd = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				String addr = rs.getString(5);
				System.out.println(id + "\t" +pwd + "\t" + name + "\t" + tel + "\t" + addr);
				} 
			System.out.println();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void hiFind() {
		dbConnection();
		
		String sql = "select * from store_product where sp_quantity < ?";
		System.out.println("������ �������ּ���.");
		int n = sc.nextInt();
		
		System.out.println("=============================================");
		System.out.println("������\tǰ��\tǰ��\t����\t����");
		System.out.println("=============================================");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, n);
			rs = pstmt.executeQuery();	
			while(rs.next()) {
				String store = rs.getString(1);
				String numb = rs.getString(2);
				String name = rs.getString(3);
				int quantity = rs.getInt(4);
				int price = rs.getInt(5);
				System.out.println(store + "\t" + numb + "\t" + name + "\t" + quantity + "\t" + price);
				} 
			} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}
