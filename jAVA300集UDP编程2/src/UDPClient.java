import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket client = new DatagramSocket(8887);
        String string = "hello world";
        byte[] bytes = string.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,new InetSocketAddress("localhost",8888));
        client.send(datagramPacket);
        client.close();
    }
}
