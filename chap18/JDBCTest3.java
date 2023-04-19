import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest3 {
	public static void main(String args[]) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/Haksa?serverTimezone=UTC";
		
		String id="root";
		String pw="1234";
		
		Statement stmt;
		ResultSet result;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB����Ϸ�");
			
			stmt = conn.createStatement();
			// createStatement() �޼ҵ带 ����Ͽ� Statement ��ü�� ��ȯ
			
			stmt.executeUpdate("insert into std values(2022951111,'pklee','Management',98,3)");
			stmt.executeUpdate("insert into std values(2021981133,'sdkim','Music',100,1)");
			stmt.executeUpdate("insert into std values(2022951141,'chlim','FineArt',99,2)");
			// ��ü�� executeUpdate() �޼ҵ带 ����Ͽ� SQL�� �����Ͽ� ���̺� ���ڵ带 �߰� 
			
			result = stmt.executeQuery("select * from std");
			// ��ü�� executeQuery() �޼ҵ带 ����Ͽ� SQL�� �����ϰ� ����� ResultSet ��ü�� ��ȯ 
			while(result.next()) { // ����� ������ �ݺ�
				int hakbun = result.getInt(1); // �ε����� �̿�
				String name = result.getString("name"); // �÷� �̸��� �̿�
				String dept = result.getString("dept");
				int score = result.getInt(4);
				int grade = result.getInt("grade");
				System.out.println(hakbun+" "+name+" "+dept+" "+score+" "+grade);
				//����� ���
			}
			result.close();  // ���� �ڿ��� ��ȯ
			stmt.close();
			conn.close();
			
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC �巯�̹� �ε� ����");
		} catch(SQLException e) {
			System.out.println("DB ���� ����");
		}		
	}
}