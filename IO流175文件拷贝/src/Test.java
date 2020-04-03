import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Test {
/**
 * 本质是文件输入与输出流来实现的
 * @param args
 */
	public static void main(String[] args) {
		File filer = new File("输入.txt");
		if (filer.exists()) {
			System.out.println("文件存在");
		}else {
			try {
				filer.createNewFile();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		File filec = new File("输出.txt");
		
		//选择流:输入流 and 输出流
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(filer);
			outputStream = new FileOutputStream(filec);
			//操作1.读取数据
			byte[] bs = new byte[1024];
			int len = -1;
			while((len = inputStream.read(bs))!=-1) {
				//String string = new String(bs,0,len);
				//读取完成
				//输入到另外一个文件中
				outputStream.write(bs);
				outputStream.flush();
				
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (inputStream!=null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}
}
