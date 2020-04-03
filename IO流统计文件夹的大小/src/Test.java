import java.io.File;
/**
 * 使用面向对象统计文件加大小
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
	//初始值都为0
	private String string;
	//大小
	//文件夹路径
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		File file = new File( System.getProperty("user.dir"));
		CountFilesTool countFiles = new CountFilesTool("D:\\JavaWork\\");
		System.out.println("文件夹的大小为:"+countFiles.getLen());
		System.out.println("文件的个数为:"+countFiles.getFileSize());
		System.out.println("文件夹的个数为:"+countFiles.getDirSize());
		System.out.println("-----初始值的测试--------");
		Test test = new Test();
		System.out.println("int 的初始值为:"+test.number);
		System.out.println("String 的值为:"+test.string);
	}
}
