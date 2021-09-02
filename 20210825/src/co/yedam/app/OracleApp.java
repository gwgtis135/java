package co.yedam.app;	 //co.yedam.app.OracleApp.class

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleApp {
	public static void main(String[] args) {
		String user = "hr";
		String pass = "hr";
	    String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	    String url = "jdbc:oracle:thin:@localhost:1521175.114.153.194:xe; ip주소에 연결하는 방법 
	       
	    try {
	    	Class.forName("oracle.jdbc.driver.OracleDriver");      				  //드라이브가 있는지 확인해주는 기능 
	    	Connection conn = DriverManager.getConnection(url, user, pass);		  //커넥션 개체로 db에 연결
	    	System.out.println("연결성공");                       
//	    	쿼리 -> 쿼리를 실행할 statement 객체가 필요 -> 화면에 출력. 
	    	String sql = "select * from employees";           		
	    	Statement stmt = conn.createStatement();		
	    	stmt.executeQuery(sql);
	    	ResultSet rs = stmt.executeQuery(sql); 
	    	//ResultSet : set 컬렉션   executeQuery: 조회 할때 쓰는 것, 입력, 수정, 삭제 executeUpdate()를 사용 
	    	
	    	while(rs.next()) {		//next() = > 가져올 요소가 있는지 체크 있으면 한건 가져오고 true; 가져올 데이터가 없으면 false 출력
	    		System.out.print("사원번호: "+ rs.getInt("employee_id")); //employeeId,
	    		System.out.print("\t이름: "+ rs.getString("first_name"));
	    		System.out.print("\t이메일: "+ rs.getString("email"));
	    		System.out.print("\t급여: "+ rs.getString("salary"));
	    		System.out.println();
	    	}
	    }catch(ClassNotFoundException | SQLException e ) {
	    	e.printStackTrace();
	    }
	    System.out.println("end===");
	       
	
	}	
	
}
