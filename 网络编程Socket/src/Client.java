import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",8888);
//            System.out.println(socket);
            OutputStream outputStream = socket.getOutputStream();
            //发送数字110到服务端
            outputStream.write(110);
            System.out.println("发送完成");
            outputStream.close();
            socket.close();
        }catch (UnknownHostException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
