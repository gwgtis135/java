package co.yedam.employee;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EMPDAO extends DAO {

	//Connection, ResultSet, Statemane, connect(), disconnect()  ��ü�� �� ���� 
	
	//�߰����. (��ȸ, �Է�...)
	
	public void getEmpList() { 
		connect();
//		���� -> ������ ������ statement ��ü�� �ʿ� -> ȭ�鿡 ���. 
    	String sql = "select * from employees";  
    	try {
    	stmt = conn.createStatement();   //Ŀ�ؼ��� ��������� �ñ� Ŀ��Ʈ�� ȣ���� �� ������� 
    	rs = stmt.executeQuery(sql);
    	//ResultSet : set �÷���   executeQuery: ��ȸ �Ҷ� ���� ��, �Է�, ����, ���� executeUpdate()�� ��� 
    	
    	while(rs.next()) {		//next() = > ������ ��Ұ� �ִ��� üũ ������ �Ѱ� �������� true; ������ �����Ͱ� ������ false ���
    		System.out.print("�����ȣ: "+ rs.getInt("employee_id")); //employeeId,
    		System.out.print("\t�̸�: "+ rs.getString("first_name"));
    		System.out.print("\t�̸���: "+ rs.getString("email"));
    		System.out.print("\t�޿�: "+ rs.getString("salary"));
    		System.out.println();
    	}
	}catch(SQLException e ) {
		e.printStackTrace();
		}
	}//end of getEmpList
	//�Ѱ� �߰����
	void insertEmp(String empId,String lastName,String email,String hireDate,String jobId) {
		String sql = "INSERT INTO employees(email, hire_date, job_id, last_name, employee_id) \r\n" + 
				"values(\'"+email+"\',\'"+hireDate+"\',\'"+jobId+"\',\'"+lastName+"\',"+empId+")";
		System.out.println(sql);
		connect(); //conn = ��ü	
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);        //�ۼ��� sql ������ ���� 
			System.out.println(r+"�� �ԷµǾ����ϴ�.");
 
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
		connect(); //conn = ��ü	
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);        //�ۼ��� sql ������ ���� 
			System.out.println(r+"�� �ԷµǾ����ϴ�.");
 
		}catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end========");
	}
	
	//prinfó�� ?�� ������ 
	void updateEmp(Employee emp){
		String sql = "update employees set email = ? where employee_id = ?";
		connect();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql); //PreparedStatement
			psmt.setString(1, emp.getEmail());
			psmt.setInt(2,  emp.getEmployeeId());
			int r = psmt.executeUpdate();		//insert, delete, update => executeUpdate(),
			System.out.println(r+"�� ����Ǿ����ϴ�.");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void delete(int eno) {
		//����
		//psmt ��ü. �Ķ���� ó��
		//psmt.executeUpdate
		String sql = "delete from employees where employee_id = ?";
		try {
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setInt(1,eno);
		int r = psmt.executeUpdate();
		System.out.println(r+ "�� ������ ");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
