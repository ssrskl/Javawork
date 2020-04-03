//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		double x1,y1,x2,y2;
//		double length;
//		while(scanner.hasNext()) {
//				x1 = scanner.nextDouble();
//				y1 = scanner.nextDouble();
//				x2 = scanner.nextDouble();
//				y2 = scanner.nextDouble();
//				length = (double)Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
//				System.out.format("%.2f", length).println();				
//		}
//	}
//}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x1,y1,x2,y2;
		double length;
		while(scanner.hasNext()) {
				x1 = scanner.nextDouble();
				y1 = scanner.nextDouble();
				x2 = scanner.nextDouble();
				y2 = scanner.nextDouble();
				length = (double)Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
				System.out.printf("%.2f%n", length);				
		}
	}
}