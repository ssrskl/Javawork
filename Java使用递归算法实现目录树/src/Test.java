import java.io.File;

public class Test {
	public static void main(String[] args) {
		File file = new File("D:\\JavaWork");
		printFile(file, 0);
	}
	static void printFile(File file,int level) {
		//输出层数
		for (int i = 0; i < level; i++) {
			System.out.print("-");
		}
		//输出文件名
		System.out.println(file.getName());
		//如果是目录则获取子文件列表，并且对每个目录进行相同的操作
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File temp : files) {
				printFile(temp, level+1);
			}
		}
	}
}
