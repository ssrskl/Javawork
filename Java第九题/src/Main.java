import java.util.Scanner;

/**
 * 平方与立方和
 * @author HASEE
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m,n;
		long oushu=0,jishu=0;
		while(scanner.hasNext()) {
			m = scanner.nextInt();
			n = scanner.nextInt();
			if (m>n) {
				m = m ^ n;
				n = n ^ m;
				m = m ^ n;
			}
			for (; m <= n; m++) {
				if (m%2!=0) {
					jishu+=Math.pow(m, 3);
				}else if (m%2==0) {
					oushu+=Math.pow(m, 2);
				}
			}
			System.out.format("%d %d", oushu,jishu).println();
			jishu=0;
			oushu=0;
		}
	}
}
