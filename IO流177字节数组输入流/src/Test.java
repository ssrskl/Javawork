import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * �ֽ�����������
 * 1.Դͷ���ֽ����飬���ǲ�Ҫ̫��
 * 1.����Ҫ��������ϵͳ����
 * 2.����Ҫ�رգ���gc���ر�
 * 3.ʲô����������ת�����ֽ�����
 * @author HASEE
 *
 */
public class Test {

	public static void main(String[] args) {
		byte[] bs = "HelloWorld".getBytes();
		//ѡ����
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
