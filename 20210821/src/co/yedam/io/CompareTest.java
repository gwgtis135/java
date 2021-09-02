package co.yedam.io;

public class CompareTest {
	public static void main(String[] args) {
		
		//정렬할 때는 compare
		// 정렬할 때 앞이냐 뒤냐 할때 사용됨 
		
	
	String a = "aabc";
	String b = "ac";
	
//	System.out.println((int)'a');
//	System.out.println((int)'b');
	
	int result = a.compareTo(b);
	if(result<0) {
		System.out.println("작다");
	}else if(result ==0) {
		System.out.println("같다");
	}else {
		System.out.println("크다");
	}
	
	Emp e1 = new Emp(100, "홍길동", "인사");
	Emp e2 = new Emp(100, "김길동", "인사");
	
	result = e1.compareTo(e2);
	System.out.println(result);
	

	}
}
