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
//	    String url = "jdbc:oracle:thin:@localhost:1521175.114.153.194:xe; ip�ּҿ� �����ϴ� ��� 
	       
	    try {
	    	Class.forName("oracle.jdbc.driver.OracleDriver");      				  //����̺갡 �ִ��� Ȯ�����ִ� ��� 
	    	Connection conn = DriverManager.getConnection(url, user, pass);		  //Ŀ�ؼ� ��ü�� db�� ����
	    	System.out.println("���Ἲ��");                       
//	    	���� -> ������ ������ statement ��ü�� �ʿ� -> ȭ�鿡 ���. 
	    	String sql = "select * from employees";           		
	    	Statement stmt = conn.createStatement();		
	    	stmt.executeQuery(sql);
	    	ResultSet rs = stmt.executeQuery(sql); 
	    	//ResultSet : set �÷���   executeQuery: ��ȸ �Ҷ� ���� ��, �Է�, ����, ���� executeUpdate()�� ��� 
	    	
	    	while(rs.next()) {		//next() = > ������ ��Ұ� �ִ��� üũ ������ �Ѱ� �������� true; ������ �����Ͱ� ������ false ���
	    		System.out.print("�����ȣ: "+ rs.getInt("employee_id")); //employeeId,
	    		System.out.print("\t�̸�: "+ rs.getString("first_name"));
	    		System.out.print("\t�̸���: "+ rs.getString("email"));
	    		System.out.print("\t�޿�: "+ rs.getString("salary"));
	    		System.out.println();
	    	}
	    }catch(ClassNotFoundException | SQLException e ) {
	    	e.printStackTrace();
	    }
	    System.out.println("end===");
	       
	
	}	
	
}
