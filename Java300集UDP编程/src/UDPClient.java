import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 接收端
 * 1.使用DatagramSocket 指定端口，创建发送端
 * 2.准备数据，封装数据包
 * 3.发送
 */
public class UDPClient {
    public static void main(String[] args) throws IOException {
        System.out.println("发送方启动中");
       // 1.使用DatagramSocket 指定端口，创建发送端
        DatagramSocket client = new DatagramSocket(8888);
        //2.准备数据，封装数据包
        String msg = "Hello World!!!!";
        byte[] datas = msg.getBytes();
        //
        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",9999));
        client.send(packet);
        //释放资源
        client.close();
    }
}
