package miniproject;

public class BulletinBoard {
	private int index;
	private String name;
	private String content;
	
	
	
	public BulletinBoard() {
		super();
	}
	public BulletinBoard(int index, String name, String content) {
		super();
		this.index = index;
		this.name = name;
		this.content = content;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
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
	
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
