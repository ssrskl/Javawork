import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * �ļ��ַ������
 * @author HASEE
 *
 */
public class Test {

	public static void main(String[] args) {
		File file = new File("dest.txt");
		Writer writer = null;
		try {
			//д��һ
			String string = "Oh ! �㰡̫���ˣ���";
			writer = new FileWriter(file);
			char[] datas = string.toCharArray();
			writer.write(datas,0,datas.length);
			writer.flush();
			//д����
			writer.write(string+"��������");
			writer.flush();
			//д����
			writer.append("����������").append("��������");
			writer.flush();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}
}
