package co.yedam.app;
public class Memo {
	String date,content,no;
	Memo(){
		
	}
	Memo(String no, String date, String content){
		this.no=no;
		this.date=date;
		this.content=content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	public String toString() {
		return ("no : " + no + "\tdate : " + date + "\tcontent" + content);
	}
	
}
