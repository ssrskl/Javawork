import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("src/Test.java","r");
        //获取RandomAccessFile对象文件指针的位置，初始值为0
        System.out.println("RandomAccessFile指针初始位置:"+randomAccessFile.getFilePointer());
        randomAccessFile.seek(2);
        byte[] bytes = new byte[1024];
        int hasRead = 0;
        while ((hasRead = randomAccessFile.read(bytes))>0){
            System.out.println(new String(bytes,0,hasRead));
        }
    }
}
