import java.io.IOException;
import java.net.URL;

public class Test{
    public static final String APPKEY = "210a2dbc9cbd4446";// ���appkey
    public static final String URL = "https://api.binstd.com/iqa/query";
    public static final String question = "����";// ����(utf-8)
    public static void main(String[] args) throws IOException {
        String result = null;
        String url = URL + "?appkey=" + APPKEY + "&question+" + question;
        result = HttpUtil.sendGet("https://api.binstd.com/iqa/query?appkey=210a2dbc9cbd4446&question=%E6%B2%B3%E5%8D%97%E5%A4%A9%E6%B0%94","UTF-8");
        System.out.println(result);
        JSON
        //HttpUtil.sendGet("https://api.binstd.com/iqa/query","?appkey=210a2dbc9cbd4446&question=��������");
    }
}
