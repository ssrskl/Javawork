import java.util.Scanner;

/**
 * 计算球的体积
 * @author HASEE
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double rid,v;
		double PI = 3.1415927;
		while(scanner.hasNext()) {
			rid = scanner.nextDouble();
			v = 4*PI/3*(Math.pow(rid, 3));
			System.out.format("%.3f", v).println();
		}
	}
}
