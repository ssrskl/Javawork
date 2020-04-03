import java.io.File;

/**
 * mkdir()确保上级目录存在
 * mkdirs()上级目录
 * list()列出下一级
 * 列出所有盘符listRoots()
 * @author HASEE
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("D:\\JavaWork\\IO流目录\\src\\text");
		File dir2 = new File("D:\\JavaWork\\IO流目录\\src\\text2\\asdasd");
		boolean flag = dir.mkdir();
		boolean flag2 = dir2.mkdir();
		System.out.println(flag2);
		System.out.println(flag);
		System.out.println("----------mkdir----------------");
		File file = new File("D:\\JavaWork\\IO流目录\\src\\dir\\text");
		boolean b = file.mkdirs();
		System.out.println(b);
		System.out.println("-------列出所有盘符——————————");
		File[] root = dir.listRoots();
		for (File file2 : root) {
			System.out.println(file2.getAbsolutePath());
		}
	}
}
