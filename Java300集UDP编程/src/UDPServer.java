import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * ���ն�
 * 1.ʹ��DatagramSocket ָ���˿ڣ��������ն�
 * 2.׼����������װ���ݰ�
 * 3.����ʽ����
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("���շ�����");
        DatagramSocket server = new DatagramSocket(9999);
        byte[] container = new byte[1024*60];
        DatagramPacket packet = new DatagramPacket(container,0,container.length);
        server.receive(packet);
        byte[] datas = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(datas,0,len));
        server.close();
    }
}
