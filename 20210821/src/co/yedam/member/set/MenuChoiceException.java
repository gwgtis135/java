package co.yedam.member.set;

public class MenuChoiceException extends Exception {

	int wrongChoice;

	public MenuChoiceException(int wrongChoice) {
		super();
		this.wrongChoice = wrongChoice;
	}
	
	public void shpwWrongChoice() {
		System.out.println(wrongChoice+"는 없는 메뉴번호입니다.");
	}
}
