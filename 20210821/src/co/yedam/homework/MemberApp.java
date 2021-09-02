package co.yedam.homework;

import co.yedam.phonebook.INIT_MENU;
import co.yedam.phonebook.MenuChoiceException;
import co.yedam.phonebook.MenuViewer;

public class MemberApp {

	public static void main(String[] args) {

		// 싱글톤으로 틀여옴
		MemberManager manager = MemberManager.getInstance();
		int choice;

		while (true) {
			try {
				MenuViewer.showMenu();
				choice = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();

				if (choice < INIT_MENU.INPUT || choice > INIT_MENU.EXIT) {
					throw new MenuChoiceException(choice);
				}
				switch (choice) {
				case INIT_MENU.INPUT:
					manager.inputData();
					break;
				case INIT_MENU.SEARCH:
					manager.searchData();
					break;
				case INIT_MENU.DELETE:
					manager.deleteData();
					break;
				case INIT_MENU.EXIT:
					manager.storeToFile();
					System.out.println("종료");
					return; // 메인에서 return하면 프로그램 끝
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
			}
		}

	}

}