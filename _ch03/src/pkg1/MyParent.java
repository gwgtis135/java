package pkg1;

public class MyParent{        //접근제어자가 public         public 클래스 파일과 소스파일 이름이 일치해야함 
	private int prv;
	int dft;
	protected int prt;
	public int pub;

	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}
 class MyParentest {


	public static void main(String[] args) {
		MyParent p = new MyParent();
	//	System.out.println(p.prv);
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
