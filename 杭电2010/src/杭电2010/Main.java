package ����2010;
/**
 * Ҫ�Լ��ж�m��n�Ĵ�С�����ҽ�С�ĸ�ֵΪm
 * ���һ��ֵ���治���пո�
 * 
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n,m;
		int g,s,b,all;
		boolean flag=false;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			m = scanner.nextInt();
			n = scanner.nextInt();
			if (m>n) {
				m = m^n;
				n = m^n;
				m = m^n;
			}
			for (; m <= n; m++) {
				g = m%10;
				s = m/10%10;
				b = m/100;
				/**
				 * g = m%10;
				 * s = (m%100-m%10)/10;
				 * b = (m-(m%100-m%10)-m%10)/100;
				 */
				all = g*g*g+s*s*s+b*b*b;
				if (all==m) {
					System.out.format("%d ", m);
					flag = true;
				}
			}
			if(flag) {
				//System.out.format("no");
			}else {
				System.out.format("no");
			}
			System.out.println();
		}
	}
}
