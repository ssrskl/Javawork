import java.util.Scanner;

/**
 * Çó¾ø¶ÔÖµ
 * @author HASEE
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number;
		while(scanner.hasNext()) {
			number = scanner.nextDouble();
			System.out.format("%.2f", Math.abs(number)).println();
		}
	}
}
