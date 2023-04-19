import java.sql.*;

public class JDBCTest2 {
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