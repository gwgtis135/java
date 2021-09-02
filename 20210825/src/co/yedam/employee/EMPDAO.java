package co.yedam.employee;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EMPDAO extends DAO {

	//Connection, ResultSet, Statemane, connect(), disconnect()  객체가 다 있음 
	
	//추가기능. (조회, 입력...)
	
	public void getEmpList() { 
		connect();
//		쿼리 -> 쿼리를 실행할 statement 객체가 필요 -> 화면에 출력. 
    	String sql = "select * from employees";  
    	try {
    	stmt = conn.createStatement();   //커넥션이 만들어지는 시기 커넥트가 호출할 때 만들어짐 
    	rs = stmt.executeQuery(sql);
    	//ResultSet : set 컬렉션   executeQuery: 조회 할때 쓰는 것, 입력, 수정, 삭제 executeUpdate()를 사용 
    	
    	while(rs.next()) {		//next() = > 가져올 요소가 있는지 체크 있으면 한건 가져오고 true; 가져올 데이터가 없으면 false 출력
    		System.out.print("사원번호: "+ rs.getInt("employee_id")); //employeeId,
    		System.out.print("\t이름: "+ rs.getString("first_name"));
    		System.out.print("\t이메일: "+ rs.getString("email"));
    		System.out.print("\t급여: "+ rs.getString("salary"));
    		System.out.println();
    	}
	}catch(SQLException e ) {
		e.printStackTrace();
		}
	}//end of getEmpList
	//한건 추가기능
	void insertEmp(String empId,String lastName,String email,String hireDate,String jobId) {
		String sql = "INSERT INTO employees(email, hire_date, job_id, last_name, employee_id) \r\n" + 
				"values(\'"+email+"\',\'"+hireDate+"\',\'"+jobId+"\',\'"+lastName+"\',"+empId+")";
		System.out.println(sql);
		connect(); //conn = 객체	
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);        //작성한 sql 쿼리를 실행 
			System.out.println(r+"건 입력되었습니다.");
 
		}catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end========");
		
		
	}
	
	
	void insertEmp(Employee emp) {
		String sql = "INSERT INTO employees(email, hire_date, job_id, last_name, employee_id) \r\n" + 
				"values(\'"+emp.getEmail()+"\',\'"+emp.getHireDate()+"\',"
			+ "\'"+emp.getJobId()+"\',\'"+emp.getLastName()+"\',"+emp.getEmployeeId()+")";
		System.out.println(sql);
		connect(); //conn = 객체	
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);        //작성한 sql 쿼리를 실행 
			System.out.println(r+"건 입력되었습니다.");
 
		}catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end========");
	}
	
	//prinf처럼 ?가 지시자 
	void updateEmp(Employee emp){
		String sql = "update employees set email = ? where employee_id = ?";
		connect();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql); //PreparedStatement
			psmt.setString(1, emp.getEmail());
			psmt.setInt(2,  emp.getEmployeeId());
			int r = psmt.executeUpdate();		//insert, delete, update => executeUpdate(),
			System.out.println(r+"건 변경되었습니다.");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void delete(int eno) {
		//쿼리
		//psmt 객체. 파라미터 처리
		//psmt.executeUpdate
		String sql = "delete from employees where employee_id = ?";
		try {
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setInt(1,eno);
		int r = psmt.executeUpdate();
		System.out.println(r+ "건 삭제됨 ");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
