import java.net.InetAddress;
import java.net.UnknownHostException;

public class Xcheng extends Thread {
    @Override
    public void run() {
        super.run();
        InetAddress inetAddress2 = null;
        //获取本机的地址
        try {
            inetAddress2 = InetAddress.getLocalHost();
            System.out.println("主机名:"+inetAddress2.getHostName());
            System.out.println("主机地址:"+inetAddress2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
