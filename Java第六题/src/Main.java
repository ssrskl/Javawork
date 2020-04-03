import java.util.Scanner;

/**
 * ³É¼¨×ª»»
 * @author HASEE
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double chengji;
		while(scanner.hasNext()) {
			chengji = scanner.nextDouble();
			if (chengji>=90&&chengji<=100) {
				System.out.println("A");
			}else if (chengji<=89&&chengji>=80) {
				System.out.println("B");
			}else if (chengji<=79&&chengji>=70) {
				System.out.println("C");
			}else if (chengji<=69&&chengji>=60) {
				System.out.println("D");
			}else if (chengji<=59&&chengji>=0) {
				System.out.println("E");
			}else {
				System.out.println("Score is error!");
			}
		}
	}
}
