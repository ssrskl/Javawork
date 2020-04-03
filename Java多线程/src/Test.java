import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        File file = new File("a.txt");
        try {
            String string = FileUtils.readFileToString(file,"gbk");
            System.out.println(string);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        AThread axc = new AThread("A");
        AThread bxc = new AThread("B");
        AThread cxc = new AThread("C");
        //new 一个线程类
//        mythear.setName("Hello");
        axc.start();
        bxc.start();
        cxc.start();
        System.out.println("运行结束");
    }
}
