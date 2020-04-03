import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 文件字符流
 * @author HASEE
 *
 */
public class Test {
	public static void main(String[] args) {
		//创建源
		File file = new File("abc.txt");
		if (file.exists()) {
			
		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		//选择流
		Reader reader = null;
		try {
			reader = new FileReader(file);
			//reader方法操作的是字符数组
			char[] flush = new char[1024];
			int len = -1;
			while((len = reader.read(flush)) != -1) {
				String msg = new String(flush,0,len);
				System.out.println(msg);
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
}
