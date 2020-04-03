package º¼µç2009;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double n,m;
		double all=0;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			all = n;
			for (int i = 1; i < m; i++) {
			all += Math.sqrt(n);
			n = Math.sqrt(n);
			}
			System.out.format("%.2f", all).println();
			all = 0;
		}
	}
}
