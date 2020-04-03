
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int sum = 0;
			int arr[] = new int[m-n];
			
			for (int i=n;i<=m;i++) {
				int a = i/100; //百位
				int b = i/10%10; //十位
				int c = i%10;
				if (a*a*a+b*b*b+c*c*c==i) {
					arr[sum++] = i;
				} 
			}
			
			if (sum==0) {
				System.out.print("no");
			} else {
				for (int i=0;i<sum;i++) {
					System.out.print(i==sum-1?arr[i]:arr[i]+" ");
					//关键点
				}
			}			
			
			System.out.println();
		}
	}
}
