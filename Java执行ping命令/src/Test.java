import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Test {

    public static void main(String[] args) throws IOException {

        //��ȡ����ip��ַ
        InetAddress inetAddress = InetAddress.getLocalHost();
        String ip = inetAddress.getHostAddress();
        System.out.println("����ipΪ:"+ip);
        //80.1 ~ 80.255
        for (int i = 1; i <= 255; i++) {
            System.out.println("���ڲ���:"+"192.168.80."+i);
            Process p = Runtime.getRuntime().exec("ping " + "192.168.80."+i);
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                if (line.length() != 0)
                    sb.append(line + "\r\n");
            }
            System.out.println("����ָ��ص���Ϣ�ǣ�");
            System.out.println(sb.toString());
        }
    }

}