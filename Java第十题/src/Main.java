import java.util.Scanner;

/**
 * 数值统计
 * @author HASEE
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int fushuall=0;
		int zero = 0;
		int zhengshuall = 0;
		double shuru;
		while(scanner.hasNext()) {
			number = scanner.nextInt();
			while(number != 0) {
			for (int i = 0; i < number; i++) {
				shuru = scanner.nextDouble();
				if (shuru < 0) {
					fushuall++;
				}else if (shuru > 0) {
					zhengshuall++;
				}else if (shuru == 0) {
					zero++;
					}
				}
			System.out.format("%d %d %d", fushuall,zero,zhengshuall).println();
			fushuall = 0;
			zero = 0;
			zhengshuall = 0;
			break;
			}
			
		}
	}
}
