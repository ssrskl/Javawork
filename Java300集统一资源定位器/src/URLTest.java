import java.net.MalformedURLException;
import java.net.URL;

/**
 * http://www.baidu.com:80/index.html?uname=shsxt&age=18#a
 */
public class URLTest {
    public static void main(String[] args) throws MalformedURLException {
        String string = "http://www.baidu.com:80/index.html?uname=shsxt&age=18#a";
        //String string2 = "http://www.catjava.top";
        URL url = new URL(string);
        //��ȡ�ĸ�ֵ
        System.out.println("Э��:" + url.getProtocol());
        System.out.println("����:" + url.getHost());
        System.out.println("������Դ:" + url.getFile());
        System.out.println("������Դ:" + url.getPath());
        System.out.println("�˿�:" + url.getPort());

        //����
        System.out.println("����:"+url.getQuery());
        //ê��
        System.out.println("ê��:"+url.getRef());
    }
}
