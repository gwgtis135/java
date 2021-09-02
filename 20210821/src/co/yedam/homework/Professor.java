package co.yedam.homework;

public class Professor extends Member {
	
	private String dept;	//부서 

	public Professor(String id, String pw, String name, String dept) {
		super( id,  pw, name);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

	
	
	@Override
	public void showMember() {
		super.showMember();
		System.out.println("dept: "+dept);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
