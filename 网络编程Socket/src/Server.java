import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("监听在端口号:8888");
            Socket socket = serverSocket.accept();
            //打开输入流
            InputStream inputStream = socket.getInputStream();
            int msg = inputStream.read();
            System.out.println(msg);
            inputStream.close();
            System.out.println("有连接过来"+socket);
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
