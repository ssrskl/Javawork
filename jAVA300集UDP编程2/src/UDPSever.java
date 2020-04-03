import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPSever {
    public static void main(String[] args) throws IOException {
        DatagramSocket sever = new DatagramSocket(8888);
        byte[] bytes = new byte[60*1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length);
        sever.receive(datagramPacket);
        byte[] container = datagramPacket.getData();
        System.out.println(new String(container));
        sever.close();
    }
}
