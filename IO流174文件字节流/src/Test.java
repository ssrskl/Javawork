import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {
	public static void main(String[] args) {
		/**
		 * ����Դ
		 * ѡ����
		 * ����
		 * �ͷ�
		 * �ֶζ�ȡ
		 */
		//����Դ
		File file = new File("abc.txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		//ѡ����
		InputStream iStream = null;
		try {
			iStream = new FileInputStream(file);
			byte[] flush = new byte[1024];//һ���Զ�ȡ1k��С���ļ�
			int len = -1;
			while ((len = iStream.read(flush))!=-1) {
				String string = new String(flush,0,len);
				System.out.println(string);
			}
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (null!=iStream) {
				try {
					iStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	
	}
}
