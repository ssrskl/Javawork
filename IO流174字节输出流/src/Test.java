import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 文件字节输出流
 * @author HASEE
 *
 */
public class Test {
	public static void main(String[] args) {
		//1.创建流
		File file = new File("dest.txt");
		//2.选择流
		OutputStream oStream = null;
		try {
			oStream = new FileOutputStream(file,true);
			//true则在最后追加
			//3.操作
			String string = "IO very easy\r\n";
			byte[] bs = string.getBytes();//编码
			oStream.write(bs,0,bs.length);
			//刷新一下
			oStream.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (oStream!=null) {
				try {
					oStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
