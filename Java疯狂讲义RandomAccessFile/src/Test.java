import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("src/Test.java","r");
        //��ȡRandomAccessFile�����ļ�ָ���λ�ã���ʼֵΪ0
        System.out.println("RandomAccessFileָ���ʼλ��:"+randomAccessFile.getFilePointer());
        randomAccessFile.seek(2);
        byte[] bytes = new byte[1024];
        int hasRead = 0;
        while ((hasRead = randomAccessFile.read(bytes))>0){
            System.out.println(new String(bytes,0,hasRead));
        }
    }
}
