import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        //�����ֽ�������
        FileInputStream fileInputStream = new FileInputStream("src/Test.java");
        //����һ������Ϊ1024����Ͳ
        byte[] bytes = new byte[1024];
        var hasRead = 0;
        //ʹ��ѭ���ظ�ȡˮ
        while ((hasRead = fileInputStream.read(bytes)) > 0){
            //ȡ������Ͳ���е�ˮ,���ֽ�����ת�����ַ���
            System.out.println(new String(bytes,0,hasRead));
        }
        //�ر���
        fileInputStream.close();
    }
}
