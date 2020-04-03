import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GETget {
    public static String sendGet(String url , String param){
        String result ="";
        String urlName = url+"?"+param;
        try {
            var realUrl = new URL(urlName);
            URLConnection connection = realUrl.openConnection();
            connection.setRequestProperty("accept","*/*");
            connection.setRequestProperty("connection","Keep-Alive");
            connection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0");
            connection.connect();
            var in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(),"UTF-8")
            );
            String line;
            while ((line = in.readLine())!=null){
                result+="\n"+line;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
