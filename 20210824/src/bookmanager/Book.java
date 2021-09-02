package bookmanager;

public class Book {
	
	private String isbn;
	private String name;
	private String content;
	public Book() {
		super();
	}
	public Book(String isbn, String name, String content) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.content = content;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	//toString 스트링으로 출력해준다 ? 
	//
	@Override
	public String toString() {
		return isbn + ","+ name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	

}
