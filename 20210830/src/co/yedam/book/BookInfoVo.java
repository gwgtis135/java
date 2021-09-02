package co.yedam.book;

public class BookInfoVo {

	private String bookCode;
	private String bookName;
	private String bookAuthor;
	private String bookPublish;
	private int bookPrice;
	
	
	
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublish() {
		return bookPublish;
	}
	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	@Override
	public String toString() {
		return "BookVo [bookCode=" + bookCode + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookPublish=" + bookPublish + ", bookPrice=" + bookPrice + ", toString()=" + super.toString()
				+ "]";
	
	
	}
	public BookInfoVo() {
		super();
	}
	public BookInfoVo(String bookCode, String bookName, String bookAuthor, String bookPublish, int bookPrice) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublish = bookPublish;
		this.bookPrice = bookPrice;
	}
}
