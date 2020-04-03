import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class IPTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());

        //���������õ�InterAddress
        address = InetAddress.getByName("www.baidu.com");
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());//��ip�����ڻ�dns������ӳ�䣬�򷵻�ip��ַ
        address = InetAddress.getByName("catjava.top");
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());

        //�����˿�
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress inetSocketAddress1 = new InetSocketAddress("localhost",9000);
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress1.getHostName());
        System.out.println(inetSocketAddress.getPort());
    }
}
