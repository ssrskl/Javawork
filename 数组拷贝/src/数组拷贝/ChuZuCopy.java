package ���鿽��;

import java.io.StreamCorruptedException;

public class ChuZuCopy {
	public static void main(String[] args) {
		String[] strings = {"a","b","c"};
		String[] strings2 = new String[6];
		System.arraycopy(strings, 0, strings2, 1, 3);
		for (String temp : strings2) {
			System.out.println(temp);
		}
		/**
		 * ɾ�������е�ĳ��Ԫ�أ�Ȼ�󽫺����Ԫ�ؽ���
		 */
		System.out.println("#####################");
		System.arraycopy(strings, 1, strings, 0, strings.length-1);
		strings[strings.length-1]=null;
		for (String temp : strings) {
			System.out.println(temp);
		}
		System.out.println("#####################");
		/**
		 * �������в���ĳ��Ԫ�أ�����ԭ���鷵��
		 * �������ݣ�����һ����������飬Ȼ��ԭ���鿽����ȥ��
		 */
	}
}
