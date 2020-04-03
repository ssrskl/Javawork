import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组输入流
 * 1.源头是字节数组，但是不要太大
 * 1.不需要借助操作系统访问
 * 2.不需要关闭，又gc来关闭
 * 3.什么东西都可以转换成字节数组
 * @author HASEE
 *
 */
public class Test {

	public static void main(String[] args) {
		byte[] bs = "HelloWorld".getBytes();
		//选择流
		InputStream inputStream = null;
		inputStream = new ByteArrayInputStream(bs);
		byte[] bs2 = new byte[1];
		int len = -1;
		try {
			while((len = inputStream.read(bs2))!=-1) {
				String string = new String(bs2,0,bs2.length);
				System.out.println(string);
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
