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
	
	BookStorage books = BookStorage.getInstance();
	
	public void start() {
		books.saveData(new Book("a1", "자바", "자바를 배우자"));
	      books.saveData(new Book("b2", "JSP", "JSP 기초"));
	      books.saveData(new Book("c3", "JSP응용", "JSP 심화학습"));
	      books.saveData(new Book("d4", "자바웹", "JSP 응용"));

		
		
		int menu =0;
		do {
			 System.out.println("\n===== 1.도서등록  2.도서삭제  3.도서전체조회  4.종료=====\n");
			  System.out.print("입력>");

			menu = Integer.parseInt(sc.nextLine());
			
	         // 코드 작성
			switch(menu) {
			case MENU.INPUT :  input();  break;
			case MENU.DELETE : delete(); break; 
			case MENU.SEARCH : search(); break;
			case MENU.EXIT : System.out.println("프로그램종료");
			}			
			
		}while(menu != 4);
	}

	public void input() {
		
		System.out.println("ISBN>");
		String isbn = sc.nextLine();
		System.out.print("NAME>");
		String name = sc.nextLine();
		System.out.print("CONTENT>");
		String content = sc.nextLine();
		
		
		
		if(books.saveData(new Book(isbn, name,content))) {
			System.out.println("등록완료");
		}else {
			
			System.out.println("등록오류");
		}
		
	}

	public void delete() {
		System.out.print("NAME>");
		String name = sc.nextLine();
		
		if(books.deleteData(name)) {
			   System.out.println("삭제완료");

		}else {
			System.out.print("?��?��?���?");
		}
		
		
	}

	public void search() {
		books.searchData();
		
		
	}
}