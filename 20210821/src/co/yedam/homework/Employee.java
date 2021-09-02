package co.yedam.homework;

public class Employee extends Member {

	private String dept;      //부서 
	private String level;     //직급
	//기본 생성자

	public Employee() {
		super();
	}
	
	public Employee(String id, String pw, String name, String dept, String level) {
		super(id, pw, name );
		this.dept = dept;
		this.level = level;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getLevel() {
		return level;
	}


	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public void showMember() {
		super.showMember();
		System.out.println("dept: "+dept);
		System.out.println("level: "+level);
	}

	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", level=" + level + "]";
	}
	
	
	
	
	
	
}
