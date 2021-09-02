package co.yedam.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	Connection conn;
	Statement stmt;
	ResultSet rs;

	String user = "hr";
	String pass = "hr";
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 

	void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 저장한 클래스가 있는지 확인 여부 ?
			conn = DriverManager.getConnection(url, user, pass); // 커넥션 개체로 db에 연결
		System.out.println("연결성공");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
	}

	void disconnect() { // 커넥션을 연결해주는 기능
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
