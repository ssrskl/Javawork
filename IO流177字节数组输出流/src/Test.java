import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.sound.midi.Soundbank;

/**
 * �ֽ����������
 * @author HASEE
 *
 */
public class Test {

	public static void main(String[] args) {
		byte[] dest = null;
		ByteArrayOutputStream baos = null;
		baos = new ByteArrayOutputStream();
		byte[] datas = "showmyway".getBytes();
		baos.write(datas,0,datas.length);
		try {
			baos.flush();
			dest = baos.toByteArray();//��ȡ����
			System.out.println(dest.length+"-->"+new String(dest,0,baos.size()));
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
