import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        var fileInputStream = new FileInputStream("src/FileInputStreamTest.java");
        //创建一个长度1024的数组
        var bytes = new byte[1024];
        //保存实际的字节数
        var hasRead = 0;
        //循环读取
        while ((hasRead = fileInputStream.read(bytes))>0){
            System.out.print(new String(bytes,0,hasRead));
        }
        //释放资源
        fileInputStream.close();
    }
}
