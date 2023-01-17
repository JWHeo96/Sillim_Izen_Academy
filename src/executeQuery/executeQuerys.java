package executeQuery;

import java.util.Scanner;

import CrudMatrix.CrudMatrix;
public class executeQuerys {

	public static void main(String[] args) {
		
		String driver = null;
		String url = null;
		boolean sw = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연결하고자 하는 SQL을 입력해주세요\n(oracle/mysql)");
		String sql = sc.next();
		if(sql.equals("mysql")) {
			driver = "com.mysql.cj.jdbc.Driver";
			url = "jdbc:mysql://localhost:3306/heoDB2";
		} else if(sql.equals("oracle")) {
			driver = "oracle.jdbc.OracleDriver";
			url = "jdbc:oracle:thin:@localhost:1521:xe";
		}
		
		CrudMatrix crud = new CrudMatrix();
		crud.insertInfo(driver, url);
		
		while(sw) {
			System.out.println("원하는 작업을 선택해주세요.\n1:생성\t2:조회\t3:수정\t4:삭제\5:종료");
			int numb = sc.nextInt();
			switch(numb) {
				case 1: crud.CreateTable(); break;
				case 2: crud.ReadTable(); break;
				case 3: crud.UpdateTable(); break;
				case 4: crud.DeleteTable(); break;
				case 5: sw = false; break;
			}
		}
		
	}

}
