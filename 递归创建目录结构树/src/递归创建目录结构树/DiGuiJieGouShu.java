package �ݹ鴴��Ŀ¼�ṹ��;

import java.io.File;

public class DiGuiJieGouShu {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		File file = new File("D:\\JavaWork\\�ݹ鴴��Ŀ¼�ṹ��");
		printFile(file,0);
	}
	static void printFile(File file,int level) {
		//�������
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
