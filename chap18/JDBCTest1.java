import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//java.sql 패키지의 클리스들을 import

public class JDBCTest1 {
	public static void main(String args[]) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/Haksa?serverTimezone=UTC";
		//자신의 컴퓨터에 저장한 Haksa 데이터베이스와 연결하기 위한 url
		
		String id="root"; //데이터베이스 root id 
		String pw="1234"; //패스워드
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// JDBC 드라이버를 로드함
			
			conn = DriverManager.getConnection(url,id,pw);
			// url과 id, 패스워드로 데이터베이스와 연결
			
			System.out.println("DB연결완료");
			// 오류없이 연결이 되는 경우 출력
			
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 드러이버 로드 오류");
			// JDBC 드라이버 로드 오류
			
		} catch(SQLException e) {
			System.out.println("DB 연결 오류");
			// DB 연결 오류
		}		
	}
}
