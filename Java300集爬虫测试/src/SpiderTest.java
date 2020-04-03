import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SpiderTest {
    public static void main(String[] args) throws IOException {
        //获取URL
       // URL url = new URL("https://www.jd.com");
         URL url = new URL("https://www.baidu.com");
        //下载资源
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0");
//        var is = url.openStream();
//        var br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        var br = new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
        String msg = null;
            while (null != (msg = br.readLine())){
            System.out.println(msg);

        }
        br.close();
        //分析
        //处理
    }
}
