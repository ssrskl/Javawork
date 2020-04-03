import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收端
 * 1.使用DatagramSocket 指定端口，创建接收端
 * 2.准备容器，封装数据包
 * 3.阻塞式接收
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("接收方启动");
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
