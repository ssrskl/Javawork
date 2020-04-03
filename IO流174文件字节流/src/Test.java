import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {
	public static void main(String[] args) {
		/**
		 * 创建源
		 * 选择流
		 * 操作
		 * 释放
		 * 分段读取
		 */
		//创建源
		File file = new File("abc.txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		//选择流
		InputStream iStream = null;
		try {
			iStream = new FileInputStream(file);
			byte[] flush = new byte[1024];//一次性读取1k大小的文件
			int len = -1;
			while ((len = iStream.read(flush))!=-1) {
				String string = new String(flush,0,len);
				System.out.println(string);
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (null!=iStream) {
				try {
					iStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	
	}
}
