import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //�����ֽ�������
        var fileInputStream = new FileInputStream("src/FileInputStreamTest.java");
        //����һ������1024������
        var bytes = new byte[1024];
        //����ʵ�ʵ��ֽ���
        var hasRead = 0;
        //ѭ����ȡ
        while ((hasRead = fileInputStream.read(bytes))>0){
            System.out.print(new String(bytes,0,hasRead));
        }
        //�ͷ���Դ
        fileInputStream.close();
    }
}
