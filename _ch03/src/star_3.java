import java.util.Scanner;

public class star_3 {

	public static void main(String[] args) {

		
		
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.close();
	         
	        for (int i = 1; i <= n; ++i) {
	            for (int j = 1; j <= i - 1; ++j) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= n - i + 1; ++j) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		
		
		
		
		
		
		//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		if(1<=n&&n<=100) {
//			for(int i =1;i<=n;i++) {
//				for(int j =1;j<=n;j++) {
//					
//					if(j<i) {
//						System.out.print(" ");
//					}else {
//						System.out.print("*");
//					}
//				
//			}
//				System.out.println();
//			
//		}
//		
//	}
}
}
//*****
//****
// ***
//  **
//   *
