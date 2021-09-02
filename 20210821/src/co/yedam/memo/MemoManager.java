package co.yedam.memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import co.yedam.phonebook.PhoneBookManager;

public class MemoManager {
	
	List<Memo> memoStorage = new ArrayList<Memo>();
	Scanner sc = new Scanner(System.in);
	File file = new File("C:/Temp", "phonebook.dat");
	
	//싱글톤
	
	static MemoManager inststance = new MemoManager();
	public static MemoManager getInstance(){
		return inststance;
	}
	
	public MemoManager() {
		readFromFile();
	}
	public void inputData() {
	System.out.println("번호>");
	int no = Integer.parseInt(sc.nextLine());
	System.out.println("날짜>");
	String date = sc.nextLine();
	System.out.println("내용");
	String content = sc.nextLine();
	memoStorage.add(new Memo(no, date, content));
		
	}
	public void searchData() {//날짜를 입력받아서 같은 날짜를 모두 출력
		System.out.println("날짜를 입력하세요 >");
		String date = sc.nextLine();
		boolean findYn = false;
		for(int i = 0; i<memoStorage.size();i++) {
			if(date.equals(memoStorage.get(i).getDate())) {
				System.out.println(memoStorage.get(i));
				findYn = true;
			}
		}
		if(findYn == false) {
			System.out.println("해당 날짜의 메모가 없습니다.");
		}
//		for(int i =0;i<memoStorage.size();i++) {
//			if(memoStorage.get(i).getDate().equals(date)) {
//				System.out.println(memoStorage.get(i));
//			}
//		}
		
	
	}
	public void deleteData() {   //번호 입력 받아서 삭제 
		System.out.println("번호>");
		int no = Integer.parseInt(sc.nextLine());	
		
		for(int i =0;i<memoStorage.size();i++) {
			if(memoStorage.get(i).getNo() == no) {
				memoStorage.remove(i);
			}
			return;
		}
//		Iterator<Memo> iter =  memoStorage.iterator(); //itreator 타입으로 메모를 읽어온다
//		while(iter.hasNext())
//		{
//			Memo memo = iter.next();
//			if(no.comparTo(comparTo) == memo.getNo()) {
//				iter.remove();
//				System.out.println("삭제완료");
//				return;
//			}
//		}
//		System.out.println("일치 하는 번호가 없습니다.");
		
	}
	public void readFromFile() {
		
		if(! file.exists())           //파일이 있으면  읽어드림 없으면 return으로 프로그램 종료 
			return;					// 파일이 없는데 읽어드리면 에러
			
			try {
			FileInputStream fis = new FileInputStream(file);  //스트림이라서 바이너리로 저장됨 
			ObjectInputStream ois = new ObjectInputStream(fis);
			memoStorage = (ArrayList<Memo>)ois.readObject();
			System.out.println(memoStorage);
			
//			for(int i =0;i< list.size();i++) {
//				System.out.println(list.get(i).getName());
//			}

			}catch(Exception e) {
				e.printStackTrace();
			}
			
		
	}
	public void storeTofile() {
		
		try {
			FileOutputStream fos = new FileOutputStream(file);  //스트림이라서 바이너리로 저장됨 
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(memoStorage);
			oos.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		
	}

}
