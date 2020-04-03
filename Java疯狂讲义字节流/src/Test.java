import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        var fis = new FileInputStream("th.jpg");
        var fos = new FileOutputStream("newth.jpg");
        byte[] bytes = new byte[1024];
        var hasRead = 0;

        while ((hasRead = fis.read(bytes))>0){
            fos.write(bytes);
        }
    }
}
