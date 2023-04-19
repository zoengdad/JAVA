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
			System.out.println("DB연결완료");
			
			stmt = conn.createStatement();
			// createStatement() 메소드를 사용하여 Statement 객체를 반환
			
			stmt.executeUpdate("insert into std values(2022951111,'pklee','Management',98,3)");
			stmt.executeUpdate("insert into std values(2021981133,'sdkim','Music',100,1)");
			stmt.executeUpdate("insert into std values(2022951141,'chlim','FineArt',99,2)");
			// 객체의 executeUpdate() 메소드를 사용하여 SQL을 실행하여 테이블에 레코드를 추가 
			
			result = stmt.executeQuery("select * from std");
			// 객체의 executeQuery() 메소드를 사용하여 SQL을 실행하고 결과를 ResultSet 객체로 반환 
			while(result.next()) { // 결과의 끝까지 반복
				int hakbun = result.getInt(1); // 인덱스를 이용
				String name = result.getString("name"); // 컬럼 이름을 이용
				String dept = result.getString("dept");
				int score = result.getInt(4);
				int grade = result.getInt("grade");
				System.out.println(hakbun+" "+name+" "+dept+" "+score+" "+grade);
				//결과를 출력
			}
			result.close();  // 사용된 자원을 반환
			stmt.close();
			conn.close();
			
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 드러이버 로드 오류");
		} catch(SQLException e) {
			System.out.println("DB 연결 오류");
		}		
	}
}