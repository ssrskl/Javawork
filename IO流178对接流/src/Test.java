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
		 * ��ͼƬд�뵽�ֽ�����
		 * ���ֽ����黹ԭΪ�ļ�
		 * ͼƬ������ FileInputStream
		 * �����ֽ����� ByteArryOutputStream
		 * 
		 */
		
	}
	//ͼƬ��ȡ���ֽ�����
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	//�ֽ�����д�뵽�ļ�
	public static void byteArryToFile(byte[] src,String filePath) {
		
	}
}
