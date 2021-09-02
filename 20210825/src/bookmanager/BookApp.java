package bookmanager;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		BookApp bookApp = new BookApp();
		bookApp.start();
	}

	Scanner sc = new Scanner(System.in);

//	BookStorage books = BookStorage.getInstance();
	BookDAO bd = new BookDAO();

	public void start() {
//		bd.saveData(new Book("a1","자바","자바를 배우자"));
//		bd.saveData(new Book("b2","JSP","JSP 기초"));
//		bd.saveData(new Book("c3","JSP응용","JSP 심화학습"));
//		bd.saveData(new Book("d4","자바웹","JSP 응용"));

		int menu = 0;
		do {
			System.out.print("\n===== 1.도서등록  2.도서삭제  3.도서검색 4.전체조회 5.수정  6.종료=====\n");
			System.out.print("입력>");
			menu = Integer.parseInt(sc.nextLine());

			// 코드 작성
			switch (menu) {
			case MENU.INPUT:
				input();
				break;
			case MENU.DELETE:
				delete();
				break;
			case MENU.SEARCH:
				search();
				break;
			case MENU.SEARCHALL:
				searchAll();
				break;
			case MENU.UPDATE:
				update();
				break;
			case MENU.EXIT:
				System.out.println("프로그램종료");
			}

		} while (menu != 6);
	}

	public void input() {

		System.out.print("ISBN>");
		String isbn = sc.nextLine();
		System.out.print("NAME>");
		String name = sc.nextLine();
		System.out.print("CONTENT>");
		String content = sc.nextLine();

		bd.insert(new Book(isbn, name, content));

//		(bd.saveData(new Book(isbn, name,content))) {
//			System.out.println("등록완료");
//		}else {
//			
//			System.out.println("등록오류");
//		}

	}

	public void delete() {
		System.out.print("ISBN>");
		String isbn = sc.nextLine();

		bd.delete(isbn);

	}

	public void search() {

		System.out.print("NAME>");
		String name = sc.nextLine();
		bd.search(name);

	}

	public void searchAll() {

		bd.searchAll();

	}
	public void update() {
		System.out.print("NAME>");
		String name = sc.nextLine();
		System.out.print("ISBN>");
		String isbn = sc.nextLine();
		bd.update(name, isbn);

	}
	
}