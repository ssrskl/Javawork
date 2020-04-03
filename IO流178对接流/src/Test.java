import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) {
		/**
		 * 将图片写入到字节数组
		 * 将字节数组还原为文件
		 * 图片到程序 FileInputStream
		 * 程序到字节数组 ByteArryOutputStream
		 * 
		 */
		
	}
	//图片读取到字节数组
	public static void fileToByteArry(String fileRath) {
		File file = new File(fileRath);
		byte[] dest = null;
		InputStream inputStream = null;
		ByteArrayOutputStream baos = null;
		try {
			inputStream = new FileInputStream(file);
			baos = new ByteArrayOutputStream();
			byte[] bs = new byte[1024];
			int len = -1;
			while((len = inputStream.read(bs))!=-1) {
				baos.write(bs,0,len);
				
			}
			baos.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	//字节数组写入到文件
	public static void byteArryToFile(byte[] src,String filePath) {
		
	}
}
