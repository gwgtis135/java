package co.yedam.homework;

import co.yedam.phonebook.INPUT_SELECT;

public class Student extends Member {

	private String 	major;
	private String year;
	
	//기본 생성자
	public Student() {
		super();
	}

	public Student(String id, String pw, String name, String major, String year) {
		super(id, pw, name);
		this.major = major;
		this.year = year;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public void showMember() {
		// TODO Auto-generated method stub
		super.showMember();
		System.out.println("major: "+major);
		System.out.println("year: "+year);
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", year=" + year + "]";
	}
	

	
	
	
}
