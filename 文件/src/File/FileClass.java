package File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClass {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/����.txt");
		System.out.println(file);
		//file.createNewFile();
		file.renameTo(new File("d:/������.txt")); 
		System.out.println(System.getProperty("user.dir"));
		File file2 = new File("����.txt");//����·��Ĭ���ڳ����ļ���
		file2.createNewFile();
		file2.renameTo(new File("������.java"));
		//f5ˢ��
		/**
		 * �������õķ���
		 */
		System.out.println("File�Ƿ���ڣ�"+file2.exists());
        System.out.println("File�Ƿ���Ŀ¼��"+file2.isDirectory());
        System.out.println("File�Ƿ����ļ���"+file2.isFile());
        System.out.println("File����޸�ʱ�䣺"+new Date(file2.lastModified()));
        System.out.println("File�Ĵ�С��"+file2.length());
        System.out.println("File���ļ�����"+file2.getName());
        System.out.println("File��Ŀ¼·����"+file2.getPath());//���·��
        System.out.println("File�ľ���·����"+file2.getAbsolutePath());//����·��
        /**
         * Ŀ¼���Ĵ���
         */
        File file3 = new File("�����ļ���");
        File file4 = new File("�����ļ���2/����");
        boolean flag = file3.mkdir();//Ŀ¼��һ���ļ��в����ڣ��򲻻ᴴ������Ŀ¼
        boolean flag2 = file4.mkdir();
        System.out.println(flag);//�Ѿ�����Ҳ�᷵��false
        System.out.println(flag2);
        /**
         * ��������Ŀ¼��
         */
        File file5 = new File("�����ļ���3/�����ļ���2/�����ļ���1");
        boolean flag3 = file5.mkdirs();//mkdirs���ᴴ������Ŀ¼��
        System.out.println(flag3);
	}
}
