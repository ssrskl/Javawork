import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {
/**
 * 1.����Դ
 * 2.ѡ����
 * 3.����
 * 4.�ͷ���Դ
 * @param args
 */
	public static void main(String[] args) {
		System.out.println(~(-1));//~ͬ����java��Ҳ����ʹ��
		System.out.println(System.getProperty("user.dir"));
		 //����Դ
		File file = new File(System.getProperty("user.dir")+"//src//"+"abc.txt");
		//ѡ����
		InputStream iStream = null;
		try {
			iStream = new FileInputStream(file);
			//����
//			int data1 = iStream.read();
//			int data2 = iStream.read();
//			int data3 = iStream.read();
//			int data4 = iStream.read();//�ļ���ĩβ����-1
			//ѭ����ӡ
			for (int i = 0; i < file.length(); i++) {
				 int data5 =iStream.read();
				 System.out.print((char)data5);
			}//һ�����Ķ�ȡ
			//�ͷ���Դ
			//iStream.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			try {
				if (null!=iStream) {//��iStream�Ż�֪ͨ����ϵͳȥ�ͷţ������ָ���쳣
					iStream.close();
				}
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
