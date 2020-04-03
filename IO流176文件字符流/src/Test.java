import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * �ļ��ַ���
 * @author HASEE
 *
 */
public class Test {
	public static void main(String[] args) {
		//����Դ
		File file = new File("abc.txt");
		if (file.exists()) {
			
		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		//ѡ����
		Reader reader = null;
		try {
			reader = new FileReader(file);
			//reader�������������ַ�����
			char[] flush = new char[1024];
			int len = -1;
			while((len = reader.read(flush)) != -1) {
				String msg = new String(flush,0,len);
				System.out.println(msg);
			}
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}
}
