package co.yedam.member.set;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import co.yedam.phonebook.MenuViewer;

public class MemberManager {


	HashSet<Member> memerStorage = new HashSet<Member>(); 

	private final File datafile = new File("C:/Temp", "member111.dat");

	// 싱글톤 구현
	static MemberManager inststance = new MemberManager();

	public static MemberManager getInstance() {
		return inststance;
	}

	// 기본 생성자
	public MemberManager() {
		super();
		readFromFile();
	}

	private Professor readProfessorInfo() {

		System.out.println("id>");
		String id = MenuViewer.keyboard.nextLine();
		System.out.println("pw>");
		String pw = MenuViewer.keyboard.nextLine();
		System.out.println("name>");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("dept>");
		String dept = MenuViewer.keyboard.nextLine();

		return new Professor(id, pw, name, dept);

	}

	private Student readStudentInfo() {

		System.out.println("id>");
		String id = MenuViewer.keyboard.nextLine();
		System.out.println("pw>");
		String pw = MenuViewer.keyboard.nextLine();
		System.out.println("name>");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("major>");
		String major = MenuViewer.keyboard.nextLine();
		System.out.println("year>");
		String year = MenuViewer.keyboard.nextLine();

		return new Student(id, pw, name, major, year);

	}

	private Employee readEmployeeInfo() {

		System.out.println("id>");
		String id = MenuViewer.keyboard.nextLine();
		System.out.println("pw>");
		String pw = MenuViewer.keyboard.nextLine();
		System.out.println("name>");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("dept>");
		String dept = MenuViewer.keyboard.nextLine();
		System.out.println("level>");
		String level = MenuViewer.keyboard.nextLine();

		return new Employee(id, pw, name, dept, level);

	}

	public void inputData() {
		System.out.println("정보등록 구분");
		System.out.println("1. 교수, 2. 학생, 3. 직원");
		System.out.print("선택> ");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine(); ////////////////////// \n을 받아주기 위함 ?

		Member member = null;

		switch (choice) {
		case INPUT_SELECT.PROFESSOR:
			member = readProfessorInfo();
			break;
		case INPUT_SELECT.STUDENT:
			member = readStudentInfo();
			break;
		case INPUT_SELECT.EMPLOYE@nate.vcoE:
			member = readEmployeeInfo();
			break;
		}

		boolean isAdded = memerStorage.add(member);

		if (isAdded == true)
			System.out.println("등록완료 \n");
		else
			System.out.println("등록오류 \n");
	}

	public void searchData() {
		System.out.print("id>");
		String id = MenuViewer.keyboard.nextLine();

		Iterator<Member> itr = memerStorage.iterator();
		if (member == null) {
			System.out.println("찾는 id가 없습니다. \n");
		} else {
			member.showMember();
		}

	}

	public void deleteData() {
		System.out.print("이름>");
		String id = MenuViewer.keyboard.nextLine();

		Member member = search(id);
		
		list.remove(member);
		if (member == null) {
			System.out.println("찾는 id가 없습니다. \n");
		} else {
			member.showMember();
		}
	}

	private Member search(String id) {

		Member mem = null;

		for (int i = 0; i < list.size(); i++) {
			if (id.equals(list.get(i).getId())) {
				mem = list.get(i);
			}
		}
		return mem;
	}

	public void storeToFile() {
		try {
			FileOutputStream file = new FileOutputStream(datafile); // 파일을 새로 만들겠다.
			ObjectOutputStream oos = new ObjectOutputStream(file);
			oos.writeObject(list);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readFromFile() {

		if (!datafile.exists()) // 파일이 있으면 읽어드림 없으면 return으로 프로그램 종료
			return; // 파일이 없는데 읽어드리면 에러

		try {
			FileInputStream fis = new FileInputStream(datafile); // 스트림이라서 바이너리로 저장됨
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (ArrayList<Member>) ois.readObject();
			System.out.println(list);

//			for(int i =0;i< list.size();i++) {
//				System.out.println(list.get(i).getName());
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
