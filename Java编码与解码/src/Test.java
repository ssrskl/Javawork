import java.io.UnsupportedEncodingException;

public class Test {
/**
 * �ļ�����
 * US-ASCII:Ӣ��ASCII����
 * ISO-8859-1
 * UTF-8:�䳤��Unicode(1-3���ֽ�)
 * utf-16be����unicode(2���ַ�)
 * @param args
 * @throws UnsupportedEncodingException 
 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String mString = "����������a";
		String mString2 = "����Ҳ��֪��˵ʲô";
		//����
		byte[] datas = mString.getBytes();
		byte[] datas2 = mString2.getBytes();
		System.out.println(datas.length);
		System.out.println(datas);
		System.out.println(datas2);
		//����:�������ַ���
		datas = mString.getBytes("UTF-16LE");
		System.out.println(datas.length);
		
		//����
		mString2 = new String(datas2,0,datas2.length,"GBK");
		System.out.println(mString2);
	}
}
