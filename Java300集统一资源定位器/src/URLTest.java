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
        //获取四个值
        System.out.println("协议:" + url.getProtocol());
        System.out.println("域名:" + url.getHost());
        System.out.println("请求资源:" + url.getFile());
        System.out.println("请求资源:" + url.getPath());
        System.out.println("端口:" + url.getPort());

        //参数
        System.out.println("参数:"+url.getQuery());
        //锚点
        System.out.println("锚点:"+url.getRef());
    }
}
