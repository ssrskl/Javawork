import java.io.File;

/**
 * mkdir()ȷ���ϼ�Ŀ¼����
 * mkdirs()�ϼ�Ŀ¼
 * list()�г���һ��
 * �г������̷�listRoots()
 * @author HASEE
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("D:\\JavaWork\\IO��Ŀ¼\\src\\text");
		File dir2 = new File("D:\\JavaWork\\IO��Ŀ¼\\src\\text2\\asdasd");
		boolean flag = dir.mkdir();
		boolean flag2 = dir2.mkdir();
		System.out.println(flag2);
		System.out.println(flag);
		System.out.println("----------mkdir----------------");
		File file = new File("D:\\JavaWork\\IO��Ŀ¼\\src\\dir\\text");
		boolean b = file.mkdirs();
		System.out.println(b);
		System.out.println("-------�г������̷���������������������");
		File[] root = dir.listRoots();
		for (File file2 : root) {
			System.out.println(file2.getAbsolutePath());
		}
	}
}
