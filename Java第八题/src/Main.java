import java.util.Scanner;

/**
 * 求奇数的乘积
 * @author HASEE
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int shuzi;
		int all=1;
		while(scanner.hasNext()) {
			number = scanner.nextInt();
			for (int i = 0; i < number; i++) {
				shuzi = scanner.nextInt();
				if (shuzi%2!=0) {
					all*=shuzi;
				}
				
			}
			System.out.format("%d", all).println();
			all=1;
		}
	}
}
