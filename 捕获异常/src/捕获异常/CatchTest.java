package �����쳣;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CatchTest {
	public static void main(String[] args) {
		try {
			int a =   1/0;
			System.out.println(a);
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();//��ӡ�쳣��Ϣ
			System.out.println("�Ѳ����쳣");
		}finally {
			System.out.println("�쳣ִ��������ִ�е����");
		}
		FileReader reader=null;
		try {
			reader = new FileReader("d:/asda.txt");//���Ϊ���1
			char c = (char)reader.read();//���Ϊ���2
			//������1�׳��쳣���򲻻�ִ�����2
			/**
			 * FileNotFoundException��IOException�����ࡣ
			 * һ��������쳣�ŵ�ǰ�棬�����쳣�ŵ�����
			 * �����쳣�����ڸ����쳣��ִ��
			 */
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			try {
				if(reader!=null) {
					reader.close();
				 }
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
	}
}
