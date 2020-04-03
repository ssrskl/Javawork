
public class StringTest {
	public static void main(String[] args) {
		String string = "abc";
		String string2 = new String("abc");
		String string3 = "18"+19;//有一个String则全部都是String
		System.out.println(string3);
		System.out.println("##########################");
		/**
		 * 常量池
		 */
		String string4 = "aaaa";
		String string5 ="aaaa";
		System.out.println(string4 == string5);//string4与5都在常量池中
		//字符串比较通常用equals
		String string6 = new String("aaaa");
		System.out.println(string4 == string6);//string6与string4对象不同。
	}
}
