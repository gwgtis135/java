class MyPoint3 extends Object{
	int x;
	int y;
	
	MyPoint3(int x, int y){
		this.x = x;
		this.y = y;
	}
	//ObgectŬ������ toString()�� �������̵�
	public String toString() {
		return "x:"+x+", y:"+y;
	}
}

/*
 * class MyPoint3D extends MyPoint3{ int z;
 * 
 * //������ getLocation()�� �������̵� String getLocation() { return
 * "x:"+x+", y:"+y+", z:"+z; } }
 */
public class OverrideTest {

	public static void main(String[] args) {
		MyPoint3 p =new MyPoint3(1,2);
		
		
		System.out.println(p);
		/*
		 * System.out.println(p.toString());
		 */	}

}
