package co.yedam.employee;

public class AppMain {

	public static void main(String[] args) {
		EMPDAO dao = new EMPDAO();
		dao.getEmpList();
		//한건입력...
		String lastName = "Hongkildong";
		String email = "hong@email";
		String hireDate = "2021-08-01";
		String empId = "305";
		String jobId = "IT_PROG";
		
		
		Employee emp  = new Employee(303, "hong", "NEW@HONH@EMAIL","2021-08-01", "IT_PROG");
		
//		dao.insertEmp(empId,lastName, email, hireDate, jobId );
//		dao.insertEmp(emp);
		dao.updateEmp(emp);
//		dao.delete(305);
	}
}

