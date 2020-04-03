import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		//FileCopyTool fileCopyTool = new FileCopyTool("shur.txt", "shuchu.txt");
		File filer = new File("shur.txt");
		if (filer.exists()) {
			
		}else {
			try {
				filer.createNewFile();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		File filec = new File("shuc.txt");
		FileCopyTool fileCopyTool = new FileCopyTool(filer, filec);
		FileCopyTool fileCopyTool2 = new FileCopyTool("shur.txt", "shuc.txt");
		System.out.println("复制了两次");
	}
}
