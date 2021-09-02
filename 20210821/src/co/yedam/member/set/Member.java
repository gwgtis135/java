package co.yedam.member.set;

public class Member {
	private String id;
	private String pw; 
	private String name;

	public Member() {
		super();
	}
	

	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void showMember() {
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		System.out.println("name: "+name);
	
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}


	@Override
	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
		
	
	
	
}
