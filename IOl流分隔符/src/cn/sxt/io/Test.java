package cn.sxt.io;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		String path = "D:\\JavaWork\\IOl���ָ���\\src\\cn\\sxt\\io\\��Ŀ.txt";
		String path2 = "G:/JavaWork/IOl���ָ���/src/cn/sxt/io";
		System.out.println("D:"+File.separator);
		System.out.println(path);
		System.out.println(path2);
		try {
			File file = new File(path2);
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(System.getProperty("user.dir"));
	}
}
