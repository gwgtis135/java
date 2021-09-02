package co.yedam.book;

public class BookOnhand {
	private String bookCode;
	private String bookRent;
	private String REturn;
	private String bookIoDate;
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookRent() {
		return bookRent;
	}
	public void setBookRent(String bookRent) {
		this.bookRent = bookRent;
	}
	public String getREturn() {
		return REturn;
	}
	public void setREturn(String rEturn) {
		REturn = rEturn;
	}
	public String getBookIoDate() {
		return bookIoDate;
	}
	public void setBookIoDate(String bookIoDate) {
		this.bookIoDate = bookIoDate;
	}
	public BookOnhand(String bookCode, String bookRent, String rEturn, String bookIoDate) {
		super();
		this.bookCode = bookCode;
		this.bookRent = bookRent;
		REturn = rEturn;
		this.bookIoDate = bookIoDate;
	}
	public BookOnhand() {
		super();
	}
	

}
