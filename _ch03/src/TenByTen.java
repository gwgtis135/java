
public class TenByTen {

	public static void main(String[] args) {
		
	int start = 0;
	int g = 0;
	int k =0;
	int[] number = new int[10];
	
	for(int i=1;i<=number.length;i++) {
		for(int j=1;j<=number.length;j++) {
			
		k = start+j;
		g=start + j;
			if ((j+start)>10) {
				g= g-1;
				System.out.print(g);
			}
			else {
				System.out.print(k);
			}
		}
		start += 1; 
		System.out.println();
		}
	}
}
