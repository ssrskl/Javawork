package cn.sxn.io;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ӡ������ǵ�����");
		int row = scanner.nextInt();
		calculate(row);
	}
	public static int num(int x, int y) {
	    if (y == 1 || y == x) {
	        return 1;
	    }
	    int c = num(x - 1, y - 1) + num(x - 1, y);
	    return c;
	}
	public static void calculate(int row) {
	    for (int i = 1; i <= row; i++) {
	        for (int j = 1; j <= row - i; j++) {
	            System.out.print(" ");
	        }
	        for (int j = 1; j <= i; j++) { // ��ӡ�ո������ַ�, �ӵ�1 �п�ʼ�����ӡ
	            System.out.print(num(i, j) + " ");
	        }
	        System.out.println();
	    }
	}
}
