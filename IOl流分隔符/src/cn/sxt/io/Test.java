package cn.sxt.io;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		String path = "D:\\JavaWork\\IOl流分隔符\\src\\cn\\sxt\\io\\项目.txt";
		String path2 = "G:/JavaWork/IOl流分隔符/src/cn/sxt/io";
		System.out.println("D:"+File.separator);
		System.out.println(path);
		System.out.println(path2);
		try {
			File file = new File(path2);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(System.getProperty("user.dir"));
	}
}
