import java.net.InetAddress;
import java.net.UnknownHostException;

public class Xcheng extends Thread {
    @Override
    public void run() {
        super.run();
        InetAddress inetAddress2 = null;
        //��ȡ�����ĵ�ַ
        try {
            inetAddress2 = InetAddress.getLocalHost();
            System.out.println("������:"+inetAddress2.getHostName());
            System.out.println("������ַ:"+inetAddress2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
