import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * ���ն�
 * 1.ʹ��DatagramSocket ָ���˿ڣ��������Ͷ�
 * 2.׼�����ݣ���װ���ݰ�
 * 3.����
 */
public class UDPClient {
    public static void main(String[] args) throws IOException {
        System.out.println("���ͷ�������");
       // 1.ʹ��DatagramSocket ָ���˿ڣ��������Ͷ�
        DatagramSocket client = new DatagramSocket(8888);
        //2.׼�����ݣ���װ���ݰ�
        String msg = "Hello World!!!!";
        byte[] datas = msg.getBytes();
        //
        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",9999));
        client.send(packet);
        //�ͷ���Դ
        client.close();
    }
}
