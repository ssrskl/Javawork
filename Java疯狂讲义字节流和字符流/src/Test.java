import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        //创建字节输入流
        FileInputStream fileInputStream = new FileInputStream("src/Test.java");
        //创建一个长度为1024的竹筒
        byte[] bytes = new byte[1024];
        var hasRead = 0;
        //使用循环重复取水
        while ((hasRead = fileInputStream.read(bytes)) > 0){
            //取出“竹筒”中的水,将字节数组转换成字符串
            System.out.println(new String(bytes,0,hasRead));
        }
        //关闭流
        fileInputStream.close();
    }
}
