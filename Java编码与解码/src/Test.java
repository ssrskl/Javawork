import java.io.UnsupportedEncodingException;

public class Test {
/**
 * 文件编码
 * US-ASCII:英文ASCII编码
 * ISO-8859-1
 * UTF-8:锟戒长锟斤拷Unicode(1-3锟斤拷锟街斤拷)
 * utf-16be锟斤拷锟斤拷unicode(2锟斤拷锟街凤拷)
 * @param args
 * @throws UnsupportedEncodingException 
 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String mString = "哈哈哈西西a";
		String mString2 = "额我也不知道说什么";
		//编码
		byte[] datas = mString.getBytes();
		byte[] datas2 = mString2.getBytes();
		System.out.println(datas.length);
		System.out.println(datas);
		System.out.println(datas2);
		//编码:其他的字符集
		datas = mString.getBytes("UTF-16LE");
		System.out.println(datas.length);
		
		//解码
		mString2 = new String(datas2,0,datas2.length,"GBK");
		System.out.println(mString2);
	}
}
