package º¼µç2000;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int max,zhong,min;
		String string;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			string = scanner.nextLine();
			max = string.charAt(0);
			zhong = string.charAt(1);
			min = string.charAt(2);
			if (max<zhong) {
				max = max^zhong;
				zhong = max^zhong;
				max = max^zhong;
			}
			if(max<min) {
				max = max^min;
				min = max^min;
				max = max^min;
			}
			if(zhong<min) {
				zhong = zhong^min;
				min = zhong^min;
				zhong = zhong^min;
			}
			System.out.format("%c %c %c" , min,zhong,max).println();
		}
	}
}
