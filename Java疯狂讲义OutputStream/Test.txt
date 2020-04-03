import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/Test.java");
            FileOutputStream fileOutputStream = new FileOutputStream("Test.txt");
            byte[] bytes = new byte[32];
            var hasRead = 0;
            while ((hasRead = fileInputStream.read(bytes))>0){
                fileOutputStream.write(bytes,0,hasRead);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
