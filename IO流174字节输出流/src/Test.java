import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * �ļ��ֽ������
 * @author HASEE
 *
 */
public class Test {
	public static void main(String[] args) {
		//1.������
		File file = new File("dest.txt");
		//2.ѡ����
		OutputStream oStream = null;
		try {
			oStream = new FileOutputStream(file,true);
			//true�������׷��
			//3.����
			String string = "IO very easy\r\n";
			byte[] bs = string.getBytes();//����
			oStream.write(bs,0,bs.length);
			//ˢ��һ��
			oStream.flush();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (oStream!=null) {
				try {
					oStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}

}
