package File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClass {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/测试.txt");
		System.out.println(file);
		//file.createNewFile();
		file.renameTo(new File("d:/哈哈哈.txt")); 
		System.out.println(System.getProperty("user.dir"));
		File file2 = new File("测试.txt");//不加路径默认在程序文件中
		file2.createNewFile();
		file2.renameTo(new File("测试试.java"));
		//f5刷新
		/**
		 * 几个常用的方法
		 */
		System.out.println("File是否存在："+file2.exists());
        System.out.println("File是否是目录："+file2.isDirectory());
        System.out.println("File是否是文件："+file2.isFile());
        System.out.println("File最后修改时间："+new Date(file2.lastModified()));
        System.out.println("File的大小："+file2.length());
        System.out.println("File的文件名："+file2.getName());
        System.out.println("File的目录路径："+file2.getPath());//相对路径
        System.out.println("File的绝对路径："+file2.getAbsolutePath());//绝对路径
        /**
         * 目录树的创建
         */
        File file3 = new File("测试文件夹");
        File file4 = new File("测试文件夹2/测试");
        boolean flag = file3.mkdir();//目录中一个文件夹不存在，则不会创建整个目录
        boolean flag2 = file4.mkdir();
        System.out.println(flag);//已经存在也会返回false
        System.out.println(flag2);
        /**
         * 创建整个目录树
         */
        File file5 = new File("测试文件夹3/测试文件夹2/测试文件夹1");
        boolean flag3 = file5.mkdirs();//mkdirs将会创建整个目录树
        System.out.println(flag3);
	}
}
