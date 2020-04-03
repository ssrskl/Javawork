package 数组拷贝;

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
		 * 删除数组中的某个元素，然后将后面的元素接上
		 */
		System.out.println("#####################");
		System.arraycopy(strings, 1, strings, 0, strings.length-1);
		strings[strings.length-1]=null;
		for (String temp : strings) {
			System.out.println(temp);
		}
		System.out.println("#####################");
		/**
		 * 向数组中插入某个元素，并将原数组返回
		 * 数组扩容（定义一个更大的数组，然后将原数组拷贝进去）
		 */
	}
}
