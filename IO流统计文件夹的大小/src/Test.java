import java.io.File;
/**
 * ʹ���������ͳ���ļ��Ӵ�С
 * @author HASEE
 *
 */
public class Test {
	public int getNumber() {
		return number;
	}
	public String getString() {
		return string;
	}
	private int number;
	//��ʼֵ��Ϊ0
	private String string;
	//��С
	//�ļ���·��
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		File file = new File( System.getProperty("user.dir"));
		CountFilesTool countFiles = new CountFilesTool("D:\\JavaWork\\");
		System.out.println("�ļ��еĴ�СΪ:"+countFiles.getLen());
		System.out.println("�ļ��ĸ���Ϊ:"+countFiles.getFileSize());
		System.out.println("�ļ��еĸ���Ϊ:"+countFiles.getDirSize());
		System.out.println("-----��ʼֵ�Ĳ���--------");
		Test test = new Test();
		System.out.println("int �ĳ�ʼֵΪ:"+test.number);
		System.out.println("String ��ֵΪ:"+test.string);
	}
}
