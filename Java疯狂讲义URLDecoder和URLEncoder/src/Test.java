import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String keyWord = URLDecoder.decode(
                "%E7%96%AF%E7%8B%82java","UTF-8");
        System.out.println(keyWord);
        String msg = URLEncoder.encode("∫»“ª±≠øß∑»java","gbk");
        System.out.println(msg);
        System.out.println(URLDecoder.decode("%BA%C8%D2%BB%B1%AD%BF%A7%B7%C8java","GBK"));
    }
}
