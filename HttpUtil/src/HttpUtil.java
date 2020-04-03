import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtil {
    private static String USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0";
    //HTTP GET REQUSET
    public static String sendGet(String url ,String charset) throws IOException {
        URL realUrl = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) realUrl.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent",USER_AGENT);
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        httpURLConnection.getInputStream(),charset));
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        while ((line = bufferedReader.readLine())!=null){
            stringBuffer.append(line);
            stringBuffer.append("\r\n");
        }
        bufferedReader.close();
        httpURLConnection.disconnect();
        return stringBuffer.toString();
    }
}
