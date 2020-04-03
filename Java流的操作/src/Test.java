import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {
/**
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * @param args
 */
	public static void main(String[] args) {
		System.out.println(~(-1));//~同样在java中也可以使用
		System.out.println(System.getProperty("user.dir"));
		 //创建源
		File file = new File(System.getProperty("user.dir")+"//src//"+"abc.txt");
		//选择流
		InputStream iStream = null;
		try {
			iStream = new FileInputStream(file);
			//操作
//			int data1 = iStream.read();
//			int data2 = iStream.read();
//			int data3 = iStream.read();
//			int data4 = iStream.read();//文件的末尾返回-1
			//循环打印
			for (int i = 0; i < file.length(); i++) {
				 int data5 =iStream.read();
				 System.out.print((char)data5);
			}//一个个的读取
			//释放资源
			//iStream.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				if (null!=iStream) {//有iStream才会通知操作系统去释放，避免空指针异常
					iStream.close();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
