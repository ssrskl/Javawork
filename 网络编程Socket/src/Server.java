import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("�����ڶ˿ں�:8888");
            Socket socket = serverSocket.accept();
            //��������
            InputStream inputStream = socket.getInputStream();
            int msg = inputStream.read();
            System.out.println(msg);
            inputStream.close();
            System.out.println("�����ӹ���"+socket);
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
