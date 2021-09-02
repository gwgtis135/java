package co.yedam.memo;

import java.io.Serializable;

/**
 * 
 * @author dbale
 *메모를 저장 할수 있는 기능 
 */

public class Memo implements Serializable  {
	
	private int no;
	private String date;
	private String content;
	
	//생성자 
	
	//setter /getter
	

	

	public Memo() {
		super();
	}

	public Memo(String content) {
		//오늘 날짜를 String으로 변환 데이트 util
		String date = "";       //직접 만들어서 해주기 만약 안되면 오늘날짜 넣어주기 
		this.date = date;
		this.content = content;
		
	}

	public Memo(String date, String content) {
		super();
		this.date = date;
		this.content = content;
	}

	public Memo(int no, String date, String content) {
		super();
		this.no = no;
		this.date = date;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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


	//equals(날짜비교)        같은 날짜에 메모가 있는지 equals 18일날 한거 가지고 만들어주기 
	@Override
	public boolean equals(Object obj) {
		Memo target = (Memo)obj;
		return this.no == target.no && this.date.equals(target.date);
	}
	
	//toString
	@Override
	public String toString() {
		return "Memo [no=" + no + ", date=" + date + ", content=" + content + "]";
	}

	@Override
	public int hashCode() {
		return no+date.hashCode();
	}
	
	
	

	

	
}
