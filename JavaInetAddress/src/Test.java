import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws IOException {
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        System.out.println("ÍøÕ¾ÊÇ·ñ¿É´ï:"+ip.isReachable(2000));
    }
}
