import java.util.Scanner;

public class charAtEx_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c1 = ' ';
		char c2 = ' ';

		c1 = sc.next().charAt(0);
		c2 = sc.nextLine().charAt(3);

		System.out.println(c1);
		System.out.println(c2);

		sc.close();
	}
}
