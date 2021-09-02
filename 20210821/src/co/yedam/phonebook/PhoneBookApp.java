package co.yedam.phonebook;

public class PhoneBookApp {
	
	public static void main(String[] args)
	{
		//싱글톤으로 읽어들여옴
		PhoneBookManager manager=PhoneBookManager.getInstance();
		int choice;
		
		while(true)
		{
			try
			{
				MenuViewer.showMenu();
				choice=MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				
				if(choice<INIT_MENU.INPUT || choice>INIT_MENU.EXIT)
					throw new MenuChoiceException(choice);
				
				switch(choice)
				{	
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
					return;                //메인에서 return하면 프로그램 끝
				}
			}
			catch(MenuChoiceException e)
			{
				e.showWrongChoice();
			}
		}
	}
}
