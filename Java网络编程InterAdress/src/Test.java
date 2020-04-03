import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) {
        InetAddress inetAddress = null;
        InetAddress inetAddress1 = null;
        //InetAddress inetAddress2 = null;
        try {
            inetAddress = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress.getAddress());
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
            Xcheng xcheng = new Xcheng();
            xcheng.start();
//            inetAddress1 = InetAddress.getByName("39.107.137.230");
//            System.out.println(inetAddress1.getAddress());
//            System.out.println(inetAddress1.getHostName());
//            System.out.println(inetAddress1.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
