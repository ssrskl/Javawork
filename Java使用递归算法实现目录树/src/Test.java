import java.io.File;

public class Test {
	public static void main(String[] args) {
		File file = new File("D:\\JavaWork");
		printFile(file, 0);
	}
	static void printFile(File file,int level) {
		//�������
		for (int i = 0; i < level; i++) {
			System.out.print("-");
		}
		//����ļ���
		System.out.println(file.getName());
		//�����Ŀ¼���ȡ���ļ��б����Ҷ�ÿ��Ŀ¼������ͬ�Ĳ���
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File temp : files) {
				printFile(temp, level+1);
			}
		}
	}
}
