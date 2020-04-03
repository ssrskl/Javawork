package 递归创建目录结构树;

import java.io.File;

public class DiGuiJieGouShu {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		File file = new File("D:\\JavaWork\\递归创建目录结构树");
		printFile(file,0);
	}
	static void printFile(File file,int level) {
		//输出层数
		for(int i=0;i<level;i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for (File file2 : files) {
				printFile(file2,level+1);
			}
		}
	}
}
