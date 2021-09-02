package co.yedam.memo;

import java.io.Serializable;
import java.util.Scanner;

public class MemoApp  {
	public static void main(String[] args) throws MenuException {
		
		
		MemoManager memoManage = MemoManager.getInstance();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		while(true) {
			//메뉴 출력 
			System.out.println("1.등록  2.검색 3.삭제 4.종료");
			
			//매뉴번호 입력
			System.out.println("번호>");
			choice = Integer.parseInt(sc.nextLine());
			if(choice < MENU.INSERT || choice > MENU.EXIT) {
				throw new MenuException(choice);
			}
			
			//메뉴번호로 switch나 if문 이용 해서 기능 호출
			
			switch(choice) {
			case MENU.INSERT: memoManage.inputData();break;
			case MENU.SEARCH: memoManage.searchData();break;
			case MENU.DELETE: memoManage.deleteData();break;
			case MENU.EXIT: memoManage.storeTofile();break;
			}
			
		}
	}

}
