import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Test {
/**
 * �������ļ��������������ʵ�ֵ�
 * @param args
 */
	public static void main(String[] args) {
		File filer = new File("����.txt");
		if (filer.exists()) {
			System.out.println("�ļ�����");
		}else {
			try {
				filer.createNewFile();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		File filec = new File("���.txt");
		
		//ѡ����:������ and �����
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(filer);
			outputStream = new FileOutputStream(filec);
			//����1.��ȡ����
			byte[] bs = new byte[1024];
			int len = -1;
			while((len = inputStream.read(bs))!=-1) {
				//String string = new String(bs,0,len);
				//��ȡ���
				//���뵽����һ���ļ���
				outputStream.write(bs);
				outputStream.flush();
				
			}
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (inputStream!=null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}
}
